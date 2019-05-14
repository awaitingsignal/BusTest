package com.prokarma.bustest.di.component;


import com.prokarma.bustest.App;
import com.prokarma.bustest.di.module.AppModule;
import com.prokarma.bustest.view.ExampleFragment;
import com.prokarma.bustest.view.MainActivity;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(App app);
        AppComponent build();


    }
    void inject(MainActivity mainActivity);

    void inject(ExampleFragment exampleFragment);

}
