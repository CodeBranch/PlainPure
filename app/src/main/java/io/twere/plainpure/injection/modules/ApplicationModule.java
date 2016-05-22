package io.twere.plainpure.injection.modules;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.twere.plainpure.BuildConfig;
import io.twere.plainpure.injection.qualifier.ApplicationContext;
import io.twere.plainpure.injection.scopes.PerApplication;

@Module public final class ApplicationModule {

  private final Application mApplication;

  public ApplicationModule(Application application) {
    this.mApplication = application;
  }

  @Provides @PerApplication @ApplicationContext Context provideApplicationContext() {
    return mApplication;
  }

  @Provides @PerApplication
  static RealmConfiguration provideRealmConfiguration(@ApplicationContext Context context) {
    RealmConfiguration.Builder builder = new RealmConfiguration.Builder(context);
    if (BuildConfig.DEBUG) {
      builder = builder.deleteRealmIfMigrationNeeded();
    }
    return builder.build();
  }

  @Provides static Realm provideRealm(RealmConfiguration realmConfiguration) {
    return Realm.getInstance(realmConfiguration);
  }

  @Provides @PerApplication Resources provideResources(Context context) {
    return context.getResources();
  }
}
