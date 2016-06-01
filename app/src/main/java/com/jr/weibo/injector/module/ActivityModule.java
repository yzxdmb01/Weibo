package com.jr.weibo.injector.module;

import android.app.Activity;

import com.jr.weibo.injector.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * 抄写的，暂时不理解什么意思
 * Created by Administrator on 2016-05-31.
 */
@Module
public class ActivityModule {
    private final Activity mActivity;

    public ActivityModule(Activity mActivity) {
        this.mActivity = mActivity;
    }

    @Provides
    @PerActivity
    public Activity provideActivity() {
        return mActivity;
    }
}
