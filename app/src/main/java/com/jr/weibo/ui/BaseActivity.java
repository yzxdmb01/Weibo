package com.jr.weibo.ui;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.jr.weibo.MyApplication;
import com.jr.weibo.injector.component.ApplicationComponent;

/**
 * Created by Administrator on 2016-05-31.
 */
public abstract class BaseActivity extends AppCompatActivity {
    private Toast mToast;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initTheme();
        setContentView(initContentView());
        initUiAndListener();
    }

    /**
     * 设置view
     *
     * @return
     */
    public abstract int initContentView();

    private void initTheme() {
    }

    protected abstract void initUiAndListener();

    /**
     * 注入Injector
     */
    protected void initInjector(){};

    protected ApplicationComponent getApplicationComponent() {
//        return ((MyApplication) getApplication()).getApplicationComponent();
        return null;
    }
    public void showToast(String msg){
        if(mToast==null){
            mToast = new Toast(BaseActivity.this);
        }
        mToast.setDuration(Toast.LENGTH_SHORT);
        mToast.setText(msg);
        mToast.show();
    }


}
