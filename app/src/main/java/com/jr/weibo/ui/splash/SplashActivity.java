package com.jr.weibo.ui.splash;

import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;

import com.jr.weibo.R;
import com.jr.weibo.ui.BaseActivity;
import com.jr.weibo.ui.login.LoginActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016-05-31.
 */
public class SplashActivity extends BaseActivity {
    @Bind(R.id.splash)
    FrameLayout splash;

    @Override
    public int initContentView() {
        //splash页状态栏颜色不一样
        setTheme(R.style.AppTheme_Splash);
        return R.layout.activity_splash;
    }

    @Override
    protected void initUiAndListener() {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏
        ButterKnife.bind(this);
        AlphaAnimation aa = new AlphaAnimation(0.5f,1.0f);
        aa.setDuration(2000);
        splash.setAnimation(aa);
        aa.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                LoginActivity.startSelfActivity(SplashActivity.this);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }


}
