package com.jr.weibo.interfaces;

import com.jr.weibo.entitiy.MovieEntity;


import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016-05-23.
 */
public interface MovieService {
//    @GET("top250")
//    Call<MovieEntity> getTopMovie(@Query("start") int start,@Query("count")int count);
    @GET("top250")
    Observable<MovieEntity> getTopMovie(@Query("start")int start, @Query("count")int count);

}
