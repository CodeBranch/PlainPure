package io.twere.plainpure.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.Bind;
import butterknife.ButterKnife;
import io.twere.plainpure.PlainPureApplication;
import io.twere.plainpure.R;
import io.twere.plainpure.injection.components.ActivityComponent;
import io.twere.plainpure.injection.components.ApplicationComponent;
import io.twere.plainpure.injection.components.DaggerActivityComponent;
import io.twere.plainpure.injection.modules.ActivityModule;
import io.twere.plainpure.injection.modules.ApiModule;

public abstract class HomeActivity extends AppCompatActivity {

  @Nullable @Bind(R.id.toolbar) Toolbar toolbar;

  private ActivityComponent mActivityComponent;
  private MenuItem inboxMenuItem;

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.getApplicationComponent().inject(this);
  }

  @Override public void setContentView(int layoutResID) {
    super.setContentView(layoutResID);
    bindViews();
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    inboxMenuItem = menu.findItem(R.id.action_inbox);
    inboxMenuItem.setActionView(R.layout.menu_item_view);
    return true;
  }


  @Nullable public Toolbar getToolbar() {
    return toolbar;
  }

  protected void bindViews() {
    ButterKnife.bind(this);
    setupToolbar();
  }

  protected void setupToolbar() {
    if (toolbar != null) {
      setSupportActionBar(toolbar);
      toolbar.setNavigationIcon(R.drawable.ic_menu_white);
    }
  }

  public void setContentViewWithoutInject(int layoutResId) {
    super.setContentView(layoutResId);
  }

  protected ApplicationComponent getApplicationComponent() {
    return PlainPureApplication.getApplicationComponent();
  }

  public ActivityComponent getActivityComponent() {
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
