package com.jr.weibo.injector.component;

import android.app.Activity;

import com.jr.weibo.injector.PerActivity;
import com.jr.weibo.injector.module.ActivityModule;

import dagger.Component;

/**
 * 抄写，待理解Dagger2用法
 * Created by Administrator on 2016-05-31.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity getActivity();
}
