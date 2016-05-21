package io.twere.plainpure.injection.modules;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import dagger.Module;
import dagger.Provides;
import io.twere.plainpure.injection.qualifier.ActivityContext;
import io.twere.plainpure.injection.scopes.PerFragment;

@Module public class FragmentModule {

  private final Fragment mFragment;

  public FragmentModule(Fragment fragment) {
    mFragment = fragment;
  }

  @Provides @PerFragment @ActivityContext Context provideApplicationContext() {
    return mFragment.getActivity();
  }

  @Provides @PerFragment FragmentManager provideFragmentManager() {
    return mFragment.getFragmentManager();
  }
}
