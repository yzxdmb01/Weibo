package com.jr.weibo.ui.main;

import android.content.Context;
import android.content.Intent;

import com.jr.weibo.R;
import com.jr.weibo.ui.BaseActivity;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016-06-02.
 */
public class MainActivity extends BaseActivity {
    @Override
    protected void initUiAndListener() {
        ButterKnife.bind(this);
    }

    @Override
    public int initContentView() {
        return R.layout.activity_main;
    }

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    ;
}
