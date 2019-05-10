package com.prokarma.bustest.di.module;

import com.prokarma.bustest.bus.PlayerResponseBus;
import com.prokarma.bustest.model.PlayerResponse;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BusModule {
    @Singleton
    @Provides
    PlayerResponseBus providesPlayerResponseBus(){
        return new PlayerResponseBus();
    }


}
