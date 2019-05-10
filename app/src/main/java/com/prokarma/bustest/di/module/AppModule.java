package com.prokarma.bustest.di.module;

import com.google.gson.Gson;
import com.prokarma.bustest.Constants;
import com.prokarma.bustest.repo.remote.NBAService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = {ViewModelModule.class})
public class AppModule {
    @Provides
    @Singleton
    Gson providesGson() {
        return new Gson();
    }

    @Provides
    @Singleton
    Retrofit providesRetrofit(Gson gson) {
        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    NBAService providesNBAService(Retrofit retrofit) {
        return retrofit.create(NBAService.class);
    }

}
