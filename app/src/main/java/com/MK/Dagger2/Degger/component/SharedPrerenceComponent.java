package com.MK.Dagger2.Degger.component;

import android.content.SharedPreferences;

import com.MK.Dagger2.Degger.module.SharedPreferenceModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {SharedPreferenceModule.class})
public interface SharedPrerenceComponent {
    SharedPreferences getSharedPreference();
}