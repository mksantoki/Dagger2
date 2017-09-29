package com.MK.Dagger2.ui;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.MK.Dagger2.Degger.component.DaggerAppResocurceComponent;
import com.MK.Dagger2.Degger.component.DaggerSharedPrerenceComponent;
import com.MK.Dagger2.Degger.module.AppResourceModule;
import com.MK.Dagger2.Degger.module.SharedPreferenceModule;

/**
 * Created by mauliksantoki on 29/9/17.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private SharedPreferences preferences;
    private Resources appResources;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());

        preferences = DaggerSharedPrerenceComponent.builder().sharedPreferenceModule(new SharedPreferenceModule(getApplication())).build().getSharedPreference();
        appResources = DaggerAppResocurceComponent.builder().appResourceModule(new AppResourceModule(getApplication())).build().getAppResocurce();

        inticontroller();
        findViewId();
        setListener();


    }

    protected abstract int setLayout();

    protected abstract void inticontroller();

    protected abstract void findViewId();

    protected abstract void setListener();


    public SharedPreferences getPreferences() {
        return preferences;
    }

    public Resources getAppResources() {
        return appResources;
    }
}
