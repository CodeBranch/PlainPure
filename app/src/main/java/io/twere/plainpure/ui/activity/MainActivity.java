package io.twere.plainpure.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import io.twere.plainpure.PlainPureApplication;
import io.twere.plainpure.R;
import io.twere.plainpure.common.NavigationDrawerActivity;
import io.twere.plainpure.injection.HasComponent;
import io.twere.plainpure.injection.components.ActivityComponent;
import io.twere.plainpure.injection.components.DaggerActivityComponent;
import io.twere.plainpure.injection.modules.ActivityModule;
import io.twere.plainpure.injection.modules.ApiModule;

public class MainActivity extends NavigationDrawerActivity
    implements HasComponent<ActivityComponent> {

  private ActivityComponent activityComponent;

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initializeInjector();

    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction ft = fm.beginTransaction();
    // ft.replace(R.id.content, DribbbleShotsFragment.newInstance());
    ft.commit();
  }

  private void initializeInjector() {
    this.activityComponent = DaggerActivityComponent.builder()
        .applicationComponent(PlainPureApplication.getApplicationComponent())
        .activityModule(new ActivityModule(this))
        .apiModule(new ApiModule())
        .build();
  }

  @Override public ActivityComponent getComponent() {
    return activityComponent;
  }
}
