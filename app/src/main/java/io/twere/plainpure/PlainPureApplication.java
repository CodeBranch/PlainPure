package io.twere.plainpure;

import android.app.Application;
import android.content.res.Resources;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.core.CrashlyticsCore;
import io.fabric.sdk.android.Fabric;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.twere.plainpure.injection.components.ApplicationComponent;
import io.twere.plainpure.injection.components.DaggerApplicationComponent;
import io.twere.plainpure.injection.modules.ApplicationModule;

public class PlainPureApplication extends Application {

  private static ApplicationComponent applicationComponent = null;

  private static PlainPureApplication sInstance = null;

  @Override public void onCreate() {
    super.onCreate();
    sInstance = this;
    initializeCrashlytics();
    initializeInjector();
    RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this).build();
    Realm.setDefaultConfiguration(realmConfiguration);
  }

  private void initializeCrashlytics() {
    Crashlytics crashlytics = new Crashlytics.Builder().core(
        new CrashlyticsCore.Builder().disabled(BuildConfig.DEBUG).build()).build();
    Fabric.with(this, crashlytics);
  }

  private void initializeInjector() {
    applicationComponent =
        DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
  }

  public static ApplicationComponent getApplicationComponent() {
    return applicationComponent;
  }

  public static Realm getRealm() {
    return applicationComponent.realm();
  }

  public static PlainPureApplication getInstance() {
    return sInstance;
  }

  public static Resources getRes() {
    return sInstance.getResources();
  }
}
