package com.prokarma.bustest;

import android.app.Application;

import com.prokarma.bustest.di.component.AppComponent;
import com.prokarma.bustest.di.component.DaggerAppComponent;

public class App extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().application(this).build();

    }

    public AppComponent getmAppComponent() {
        return mAppComponent;
    }

}
