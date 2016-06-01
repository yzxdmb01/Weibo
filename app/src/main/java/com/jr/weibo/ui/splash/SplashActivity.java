package com.jr.weibo.ui.splash;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.jr.weibo.R;
import com.jr.weibo.ui.BaseActivity;

import java.util.TreeMap;

/**
 * Created by Administrator on 2016-05-31.
 */
public class SplashActivity extends BaseActivity {


    @Override
    public int initContentView() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initUiAndListener() {
        setTheme(R.style.AppTheme_Splash);
    }


}
