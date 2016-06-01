package com.jr.weibo.components.retrofit;

import android.content.Context;

import com.jr.weibo.storage.UserStorage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016-05-30.
 */
public class RequestHelper {
    private Context mContxt;
    private UserStorage mUserStorage;

    public RequestHelper(Context mContxt, UserStorage mUserStorage) {
        this.mContxt = mContxt;
        this.mUserStorage = mUserStorage;
    }

    /**
     * 用于封装请求的params
     * @return
     */
    public Map<String,String> getHttpRequestMap(){
        HashMap<String ,String> map = new HashMap<>();
//        if(mUserStorage.isLogin())
//            map.put("token",mUserStorage.getToken());
        return map;
    }
}
