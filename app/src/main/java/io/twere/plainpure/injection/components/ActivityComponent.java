package io.twere.plainpure.injection.components;

import dagger.Component;
import io.twere.plainpure.common.NavigationDrawerActivity;
import io.twere.plainpure.injection.modules.ActivityModule;
import io.twere.plainpure.injection.modules.ApiModule;
import io.twere.plainpure.injection.scopes.PerActivity;
import io.twere.plainpure.ui.activity.MainActivity;

@PerActivity @Component(dependencies = ApplicationComponent.class, modules = {
    ActivityModule.class, ApiModule.class
}) public interface ActivityComponent {
  void inject(MainActivity activity);

  void inject(NavigationDrawerActivity activity);
}
