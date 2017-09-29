package com.MK.Dagger2.Degger.module;

import android.app.Application;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppResourceModule {
    Application mApplication;

    public AppResourceModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    Resources providesSharedPreferences(Application application) {
        return application.getResources();
    }
}