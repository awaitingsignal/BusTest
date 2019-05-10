package com.prokarma.bustest.di.component;


import com.prokarma.bustest.App;
import com.prokarma.bustest.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(App app);
        AppComponent build();

    }


}
