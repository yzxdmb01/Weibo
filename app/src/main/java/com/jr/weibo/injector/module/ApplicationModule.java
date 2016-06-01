package com.jr.weibo.injector.module;

import android.content.Context;

import com.jr.weibo.components.okhttp.HttpLoggingInterceptor;
import com.jr.weibo.components.okhttp.OkHttpHelper;
import com.jr.weibo.components.retrofit.RequestHelper;
import com.jr.weibo.storage.UserStorage;
import com.squareup.otto.Bus;

import java.util.concurrent.TimeUnit;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2016-05-30.
 */
@Module
public class ApplicationModule {
    private final Context mContext;

    public ApplicationModule(Context context) {
        this.mContext = context;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext() {
        return mContext.getApplicationContext();
    }

    @Provides
    @Singleton
    public Bus provideBusEvent() {
        return new Bus();
    }

    @Provides
    @Singleton
    public UserStorage provideUserStorage() {
        return new UserStorage(mContext);
    }

    @Provides
    @Singleton
    @Named("api")
    OkHttpClient provideApiOkHttpClient(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder().connectTimeout(20*1000,TimeUnit.MILLISECONDS)
                .readTimeout(20*1000,TimeUnit.MILLISECONDS);
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.addInterceptor(logging);
        return builder.build();
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(@Named("api") OkHttpClient mOkHttpClient) {
        OkHttpClient.Builder builder = mOkHttpClient.newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true);
        builder.interceptors().clear();
        return builder.build();
    }

    @Provides
    @Singleton
    RequestHelper provideRequestHelper(Context mContext,
                                       UserStorage mUserStorage) {
        return new RequestHelper(mContext, mUserStorage);
    }

    @Provides
    @Singleton
    OkHttpHelper provideOkHttpHelper(OkHttpClient mOkHttpClient) {
        return new OkHttpHelper(mOkHttpClient);
    }
}
