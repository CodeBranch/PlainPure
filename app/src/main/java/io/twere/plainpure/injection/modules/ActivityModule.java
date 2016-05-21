package io.twere.plainpure.injection.modules;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import dagger.Module;
import dagger.Provides;
import io.twere.plainpure.injection.qualifier.ActivityContext;
import io.twere.plainpure.injection.scopes.PerActivity;

@Module public class ActivityModule {

  private final AppCompatActivity mActivity;

  public ActivityModule(AppCompatActivity activity) {
    this.mActivity = activity;
  }

  @Provides @PerActivity Activity providesMainActivity() {
    return mActivity;
  }

  @Provides @PerActivity @ActivityContext Context provideAppContext() {
    return mActivity;
  }

  @Provides @PerActivity FragmentManager provideFragmentManager() {
    return mActivity.getSupportFragmentManager();
  }
}
