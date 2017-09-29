package com.MK.Dagger2.Degger.component;

import android.content.res.Resources;

import com.MK.Dagger2.Degger.module.AppResourceModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppResourceModule.class})
public interface AppResocurceComponent {
    Resources getAppResocurce();
}