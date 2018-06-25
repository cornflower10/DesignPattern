package com.design.pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.design.pattern.strategy.GlideLoader;
import com.design.pattern.strategy.ImageLoaderUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //策略模式
        ImageLoaderUtils imageLoaderUtils = new ImageLoaderUtils(new GlideLoader());
        imageLoaderUtils.showImage();
    }
}
