package com.jr.weibo.storage;

import android.content.Context;
import android.content.SharedPreferences;

import com.jr.weibo.bean.User;
import com.jr.weibo.util.SettingPrefUtils;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;

/**
 * Created by Administrator on 2016-05-30.
 */
public class UserStorage {
    private Context mContext;
    private User user;

    public UserStorage(Context mContext) {
        this.mContext = mContext;
    }
    public void login(User user){
        this.user = user;
        SettingPrefUtils.setLoginUid(mContext,user.getId().toString());
    }

    public boolean isLogin(){
        return user!=null && SettingPrefUtils.getLoginUid(mContext).equals(user.getId().toString());
    }

    public void setToken(Oauth2AccessToken token){
        if(token == null )
            return;
        SettingPrefUtils.setToken(mContext,token);
    }
    public Oauth2AccessToken getToken(){

        return SettingPrefUtils.getToken(mContext);
    }


}
