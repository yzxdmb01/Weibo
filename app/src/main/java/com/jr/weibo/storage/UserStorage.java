package com.jr.weibo.storage;

import android.content.Context;

import com.jr.weibo.bean.User;
import com.jr.weibo.util.SettingPreUtils;

/**
 * Created by Administrator on 2016-05-30.
 */
public class UserStorage {
    private Context mContext;
    private User user;
    private String token;

    public UserStorage(Context mContext) {
        this.mContext = mContext;
    }
    public void login(User user){
        this.user = user;
        SettingPreUtils.setLoginUid(mContext,user.getId().toString());
    }

    public boolean isLogin(){
        return user!=null && SettingPreUtils.getLoginUid(mContext).equals(user.getId().toString());
    }

    public void setToken(String token){
        this.token = token;
        SettingPreUtils.setToken(mContext,token);
    }
    public String getToken(){
        return SettingPreUtils.getToken(mContext);
    }


}
