package com.jr.weibo.api.weibo;

import com.jr.weibo.bean.StatusesData;
import com.jr.weibo.bean.WeiboData;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016-05-30.
 * 微博相关api
 */
public interface StatusesService {
    /*获取公共微博*/
    @GET("public_timeline.json")
    Observable<StatusesData> getPublic(@Query("token")String token);
    /*获取当前登录用户及其所关注用户的最新微博*/
    @GET("friends_timeline.json")
    Observable<StatusesData> getHome(@Query("token")String token);
}
