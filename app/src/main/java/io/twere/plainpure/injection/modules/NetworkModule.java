package io.twere.plainpure.injection.modules;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.Module;
import dagger.Provides;
import io.twere.plainpure.PlainPureApplication;
import io.twere.plainpure.injection.scopes.PerApplication;
import io.twere.plainpure.util.NetworkUtils;

@Module public final class NetworkModule {

  @Provides @PerApplication static ConnectivityManager provideConnectivityManager() {
    return (ConnectivityManager) PlainPureApplication.getInstance()
        .getSystemService(Context.CONNECTIVITY_SERVICE);
  }

  @Provides @PerApplication NetworkUtils provideNetworkStateManager(
      ConnectivityManager connectivityManagerCompat, Context context) {
    return new NetworkUtils(connectivityManagerCompat, context);
  }
}
