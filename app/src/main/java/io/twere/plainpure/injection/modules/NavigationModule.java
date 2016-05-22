package io.twere.plainpure.injection.modules;

import dagger.Module;
import dagger.Provides;
import io.twere.plainpure.Navigator;
import io.twere.plainpure.injection.scopes.PerActivity;

@Module public final class NavigationModule {
  @Provides @PerActivity static Navigator provideNavigator() {
    return new Navigator();
  }
}
