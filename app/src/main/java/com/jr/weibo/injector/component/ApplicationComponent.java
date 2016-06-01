package com.jr.weibo.injector.component;

import android.content.Context;

import com.jr.weibo.MyApplication;
import com.jr.weibo.api.weibo.StatusesApi;
import com.jr.weibo.components.okhttp.OkHttpHelper;
import com.jr.weibo.components.retrofit.RequestHelper;
import com.jr.weibo.injector.module.ApiModule;
import com.jr.weibo.injector.module.ApplicationModule;
import com.jr.weibo.storage.UserStorage;
import com.jr.weibo.ui.BaseActivity;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 抄写，待理解Dagger2用法
 * Created by Administrator on 2016-05-31.
 */
@Singleton
@Component(modules = {ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent {
    Context getContext();

    Bus getBus();

    OkHttpHelper getOkHttpHelper();

    RequestHelper getRequestHelper();

    UserStorage getUserStorage();

    StatusesApi getStatusesApi();

    void inject(MyApplication mApplication);

    void inject(BaseActivity mBaseActivity);

}
