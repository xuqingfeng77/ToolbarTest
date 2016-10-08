package com.eposp.toolbartest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setTitle("不得了拉 我要火了");
        setTitleColor(R.color.white);

        toolbar.setLogo(R.mipmap.dialog_progress_bg);
        toolbar.setSubtitle("xuqingfeng");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.back_nor);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "不得了要火了", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
