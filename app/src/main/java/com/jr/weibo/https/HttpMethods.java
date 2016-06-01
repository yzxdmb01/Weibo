package com.jr.weibo.https;

import com.jr.weibo.entitiy.MovieEntity;
import com.jr.weibo.interfaces.MovieService;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016-05-24.
 */
public class HttpMethods {
    private static final String BASE_URL = "https://api.douban.com/v2/movie/";
    private static final int DEAFULT_TIMEOUT = 5;
    private Retrofit retrofit;
    private MovieService movieService;

    private HttpMethods() {
        //手动创建一个okHttpClient并设置超时
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.connectTimeout(DEAFULT_TIMEOUT, TimeUnit.SECONDS);
        retrofit = new Retrofit.Builder()
                .client(httpClientBuilder.build())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();
        movieService = retrofit.create(MovieService.class);
    }

    //在访问HttpMethod时创建单例
    private static class SingletonHolder{
        private static final HttpMethods  INSTANCE = new HttpMethods();
    }
    //获取单例
    public static HttpMethods getInstance(){
        return SingletonHolder.INSTANCE;
    }
    /**
     * 用于获取豆瓣电影Top250的数据
     */
    public void getTopMovie(Subscriber<MovieEntity> subscriber,int start ,int count){
        movieService.getTopMovie(start,count)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    private class HttpResultFunc<T> implements Func1<HttpResult<T> ,T> {

        @Override
        public T call(HttpResult<T> tHttpResult) {
            if(tHttpResult.getResultCode() != 0){
                throw new ApiException(tHttpResult.getResultCode());
            }
            return tHttpResult.getData();
        }
    }
}
