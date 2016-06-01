package com.jr.weibo;

import android.app.Application;

import com.jr.weibo.injector.component.ApplicationComponent;
import com.jr.weibo.injector.component.DaggerApplicationComponent;
import com.jr.weibo.injector.module.ApplicationModule;
import com.jr.weibo.storage.UserStorage;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016-05-30.
 */
public class MyApplication extends Application{
    //暂时不知道写什么，先空着吧
    private ApplicationComponent mApplicationComponent;

    @Inject
    UserStorage mUserStorage;
//    @Inject
//    OkHttpClient mOkHttpClient;

    @Override
    public void onCreate() {
        super.onCreate();
        initComponent();
    }

    private void initComponent(){
        mApplicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
        mApplicationComponent.inject(this);
    }
}
