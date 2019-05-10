package com.prokarma.bustest.di.component;


import com.prokarma.bustest.App;
import com.prokarma.bustest.di.module.AppModule;
import com.prokarma.bustest.di.module.BusModule;
import com.prokarma.bustest.view.MainActivity;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, BusModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(App app);

        AppComponent build();

    }

}
