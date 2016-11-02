package com.eposp.toolbartest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setTitleColor(R.color.white);

        toolbar.setLogo(R.mipmap.ic_launcher);
//        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.back_nor);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "不得了要火了", Toast.LENGTH_SHORT).show();
            }
        });
        toolbar.setTitle("Title");//设置主标题
//        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));//设置主标题颜色
        toolbar.setTitleTextAppearance(this, R.style.Theme_ToolBar_Base_Title);//修改主标题的外观，包括文字颜色，文字大小等

        toolbar.setSubtitle("Subtitle");//设置子标题
//        toolbar.setSubtitleTextColor(getResources().getColor(android.R.color.darker_gray));//设置子标题颜色
        toolbar.setSubtitleTextAppearance(this, R.style.Theme_ToolBar_Base_Subtitle);//设置子标题的外观，包括文字颜色，文字大小等
        Log.d("TAG","测试修改内冲突的情况");
    }

    @Override
    protected void eventOnClick() {

    }
}
