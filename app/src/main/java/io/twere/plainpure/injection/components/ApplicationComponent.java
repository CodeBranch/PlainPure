package io.twere.plainpure.injection.components;

import android.content.Context;
import dagger.Component;
import io.realm.Realm;
import io.twere.plainpure.common.view.BaseActivity;
import io.twere.plainpure.injection.modules.ApiModule;
import io.twere.plainpure.injection.modules.ApplicationModule;
import io.twere.plainpure.injection.qualifier.ApplicationContext;
import io.twere.plainpure.injection.scopes.PerApplication;

@PerApplication @Component(modules = { ApiModule.class, ApplicationModule.class })
public interface ApplicationComponent {

  void inject(BaseActivity activity);

  @ApplicationContext Context context();

  Realm realm();
}