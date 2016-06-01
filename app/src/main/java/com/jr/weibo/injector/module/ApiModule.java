package com.jr.weibo.injector.module;

import android.content.Context;

import com.jr.weibo.api.weibo.StatusesApi;
import com.jr.weibo.components.retrofit.RequestHelper;
import com.jr.weibo.storage.UserStorage;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2016-05-30.
 */
@Module
public class ApiModule {
    @Provides
    @Singleton
    public StatusesApi provideWeiboApi(UserStorage userStorage, @Named("api") OkHttpClient okHttpClient, RequestHelper requestHelper, Context mContext) {
//        return new StatusesApi(userStorage, okHttpClient, mContext);
        return null;
    }
}
