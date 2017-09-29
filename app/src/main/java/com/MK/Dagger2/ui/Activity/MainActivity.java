package com.MK.Dagger2.ui.Activity;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.MK.Dagger2.R;
import com.MK.Dagger2.ui.BaseActivity;

public class MainActivity extends BaseActivity {

    private TextView tvText;

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void inticontroller() {
        getPreferences().edit().putString("name", "maulik").apply();

    }

    @Override
    protected void findViewId() {
        tvText = (TextView) findViewById(R.id.tvText);
        tvText.setText(getPreferences().getString("name", "please set name.."));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getPreferences().edit().putString("name", "maulik santoki").apply();
                tvText.setText(getPreferences().getString("name", "please set name.."));

                nextExample();
            }
        }, 5000);
    }

    private void nextExample() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                tvText.setText(getResources().getString(R.string.name));
                nextExample();
            }
        }, 5000);
    }

    @Override
    protected void setListener() {

    }


}
