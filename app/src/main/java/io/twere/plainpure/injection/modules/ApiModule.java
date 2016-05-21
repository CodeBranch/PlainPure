package io.twere.plainpure.injection.modules;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import io.twere.plainpure.data.api.dribbble.DribbbleBucketsService;
import io.twere.plainpure.data.api.dribbble.DribbbleProjectsService;
import io.twere.plainpure.data.api.dribbble.DribbbleShotsService;
import io.twere.plainpure.data.api.dribbble.DribbbleTeamsService;
import io.twere.plainpure.data.api.dribbble.DribbbleUserService;
import io.twere.plainpure.injection.scopes.PerActivity;
import io.twere.plainpure.util.DribbbleUtils;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.schedulers.Schedulers;

@Module public class ApiModule {

  @Provides @PerActivity static OkHttpClient provideOkHttpClient() {
    return new OkHttpClient();
  }

  @Provides @PerActivity public String provideBaseURL() {
    return DribbbleUtils.DRIBBBLE_ENDPOINT;
  }

  @Provides @PerActivity
  static DribbbleBucketsService provideDribbbleBucketService(Retrofit retrofit) {
    return retrofit.create(DribbbleBucketsService.class);
  }

  @Provides @PerActivity
  static DribbbleProjectsService provideDribbbleProjectsService(Retrofit retrofit) {
    return retrofit.create(DribbbleProjectsService.class);
  }

  @Provides @PerActivity
  static DribbbleShotsService provideDribbbleShotsService(Retrofit retrofit) {
    return retrofit.create(DribbbleShotsService.class);
  }

  @Provides @PerActivity
  static DribbbleTeamsService provideDribbbleTeamsService(Retrofit retrofit) {
    return retrofit.create(DribbbleTeamsService.class);
  }

  @Provides @PerActivity static DribbbleUserService provideDribbbleUserService(Retrofit retrofit) {
    return retrofit.create(DribbbleUserService.class);
  }

  @Provides @PerActivity static Retrofit provideRetrofit(OkHttpClient httpClient, String baseUrl,
      Converter.Factory coFactory) {

    return new Retrofit.Builder().baseUrl(baseUrl)
        .addConverterFactory(coFactory)
        .addCallAdapterFactory(RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io()))
        .client(httpClient)
        .build();
  }

  @Provides @PerActivity static Converter.Factory provideConverter(Gson gson) {
    return GsonConverterFactory.create(gson);
  }

  @Provides @PerActivity static Gson provideGson() {
    return new GsonBuilder().create();
  }

  @Provides @PerActivity static HttpLoggingInterceptor provideLogger() {
    return new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
      @Override public void log(String message) {

      }
    });
  }
}
