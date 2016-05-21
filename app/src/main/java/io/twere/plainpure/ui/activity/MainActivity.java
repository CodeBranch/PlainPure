package io.twere.plainpure.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import io.twere.plainpure.PlainPureApplication;
import io.twere.plainpure.R;
import io.twere.plainpure.common.view.NavigationDrawerActivity;
import io.twere.plainpure.injection.HasComponent;
import io.twere.plainpure.injection.components.ActivityComponent;
import io.twere.plainpure.injection.components.DaggerActivityComponent;
import io.twere.plainpure.injection.modules.ActivityModule;
import io.twere.plainpure.injection.modules.ApiModule;
import io.twere.plainpure.ui.fragment.ShotListFragment;
import io.twere.plainpure.util.Ours;

public class MainActivity extends NavigationDrawerActivity
    implements HasComponent<ActivityComponent> {

  private ActivityComponent activityComponent;

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initializeInjector();

    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction ft = fm.beginTransaction();
    ft.replace(R.id.content, ShotListFragment.newInstance());
    ft.commit();
  }

  private void initializeInjector() {
    this.activityComponent = DaggerActivityComponent.builder()
        .applicationComponent(PlainPureApplication.getApplicationComponent())
        .activityModule(new ActivityModule(this))
        .apiModule(new ApiModule())
        .build();
  }

  @Override protected void onDrawerMenuClick(MenuItem menuItem) {
    if (menuItem.getItemId() == R.id.nav_shots) {
      Ours.v("fsdfsdf");
      FragmentManager fm = getSupportFragmentManager();
      FragmentTransaction ft = fm.beginTransaction();
      ft.replace(R.id.content, ShotListFragment.newInstance());
      ft.commit();
    } else if (menuItem.getItemId() == R.id.nav_designers) {
      FragmentManager fm = getSupportFragmentManager();
      FragmentTransaction ft = fm.beginTransaction();
      ft.replace(R.id.content, ShotListFragment.newInstance());
      ft.commit();
    }
  }

  @Override public ActivityComponent getComponent() {
    return activityComponent;
  }
}
