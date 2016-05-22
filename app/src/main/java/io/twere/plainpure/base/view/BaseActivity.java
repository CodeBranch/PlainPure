package io.twere.plainpure.base.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import butterknife.Bind;
import butterknife.ButterKnife;
import icepick.Icepick;
import io.twere.plainpure.PlainPureApplication;
import io.twere.plainpure.R;
import io.twere.plainpure.injection.components.ActivityComponent;
import io.twere.plainpure.injection.components.ApplicationComponent;
import io.twere.plainpure.injection.components.DaggerActivityComponent;
import io.twere.plainpure.injection.modules.ActivityModule;
import io.twere.plainpure.injection.modules.ApiModule;
import io.twere.plainpure.util.BuildUtils;

public abstract class BaseActivity extends AppCompatActivity {

  @Nullable @Bind(R.id.toolbar) Toolbar toolbar;

  private ActivityComponent mActivityComponent;
  private MenuItem inboxMenuItem;

  @Override public void onCreate(Bundle savedInstanceState) {
    this.getApplicationComponent().inject(this);
    super.onCreate(savedInstanceState);
    Icepick.restoreInstanceState(this, savedInstanceState);
  }

  @Override public void onContentChanged() {
    super.onContentChanged();
    ButterKnife.bind(this);
  }

  @Override public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    Icepick.saveInstanceState(this, outState);
  }

  @Override public void setContentView(int layoutResID) {
    super.setContentView(layoutResID);
    bindViews();
  }

/*  @Override public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    inboxMenuItem = menu.findItem(R.id.action_inbox);
    inboxMenuItem.setActionView(R.layout.menu_item_view);
    return true;
  }*/

  @Nullable public Toolbar getToolbar() {
    return toolbar;
  }

  void bindViews() {
    ButterKnife.bind(this);
    setupToolbar();
  }

  protected void setupToolbar() {
    if (toolbar != null) {
      setSupportActionBar(toolbar);
      toolbar.setNavigationIcon(BuildUtils.getDrawerMenuDrawable(this));
    }
  }

  void setContentViewWithoutInject(int layoutResId) {
    super.setContentView(layoutResId);
  }

  private ApplicationComponent getApplicationComponent() {
    return PlainPureApplication.getApplicationComponent();
  }

  ActivityComponent getActivityComponent() {
    if (mActivityComponent == null) {
      mActivityComponent = DaggerActivityComponent.builder()
          .applicationComponent(PlainPureApplication.getApplicationComponent())
          .activityModule(new ActivityModule(this))
          .apiModule(new ApiModule())
          .build();
    }

    return mActivityComponent;
  }

  protected ActivityModule getActivityModule() {
    return new ActivityModule(this);
  }
}
