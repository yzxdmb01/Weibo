package com.jr.weibo.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jr.weibo.MyApplication;
import com.jr.weibo.injector.component.ApplicationComponent;

/**
 * Created by Administrator on 2016-05-31.
 */
public abstract class BaseActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initContentView());
        initUiAndListener();
    }

    protected abstract void initUiAndListener();

    /**
     * 设置view
     * @return
     */
    public abstract int initContentView();

    protected ApplicationComponent getApplicationComponent(){
//        return ((MyApplication) getApplication()).getApplicationComponent();
        return null;
    }

}
