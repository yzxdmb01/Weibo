package com.jr.weibo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jr.weibo.R;

/**
 * Created by Administrator on 2016-05-26.
 */
public class MainFragment extends Fragment {
    private String content;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        content = getArguments().getString("content");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        TextView tv = (TextView) view.findViewById(R.id.tv_content);
        tv.setText(content);
        return view;
    }
    public static MainFragment getInstance(String content){
        MainFragment mainFragment = new MainFragment();
        Bundle bundle = new Bundle();
        bundle.putString("content",content);
        mainFragment.setArguments(bundle);
        return mainFragment;
    }
}
