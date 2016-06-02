package com.jr.weibo.api.weibo;

import android.content.Context;

import com.jr.weibo.bean.StatusesData;
import com.jr.weibo.components.retrofit.RequestHelper;
import com.jr.weibo.storage.UserStorage;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016-05-30.
 */
public class StatusesApi {
    static final String BASE_URL = "https://api.weibo.com/2/statuses/";

    private StatusesService mStatusesService;
    private RequestHelper mRequestHelper;
    private UserStorage mUserStorage;
    private Context mContext;

    public StatusesApi( UserStorage mUserStorage,
                       OkHttpClient mOkHttpClient, Context context) {
        this.mUserStorage = mUserStorage;
        this.mContext = context;
        Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .client(mOkHttpClient)
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        mStatusesService = retrofit.create(StatusesService.class);
    }
    /**
     * 获取最新的公共微博
     */
    public Observable<StatusesData> getPublic(){
//        Map<String,String> params = mRequestHelper.getHttpRequestMap();
//        String token = params.get("token");
        String token = mUserStorage.getToken().getToken();
        return mStatusesService.getPublic(token).subscribeOn(Schedulers.io());
    }
    /**
     * 获取当前登录用户及其所关注用户的最新微博
     */
    public Observable<StatusesData> getHome(){
//        Map<String ,String > params = mRequestHelper.getHttpRequestMap();
//        String token = params.get("token");
        String token = mUserStorage.getToken().getToken();
        return mStatusesService.getHome(token).subscribeOn(Schedulers.io());
    }
}
