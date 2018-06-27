package com.design.pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.design.pattern.proxy.IProxy;
import com.design.pattern.proxy.Proxy;
import com.design.pattern.proxy.RealProxy;
import com.design.pattern.proxy.dyproxy.DyInvocationHandler;
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
        //静态代理
        IProxy proxy = new Proxy();
        proxy.showImage();
        //动态代理,retrofit 用动态代理获取apiserivece注解的方法
        IProxy realProxy =new RealProxy();
       IProxy iProxy = (IProxy) java.lang.reflect.Proxy.newProxyInstance(realProxy.getClass().getClassLoader()
                ,realProxy.getClass().getInterfaces(),new DyInvocationHandler(realProxy));
        iProxy.showImage();
    }
}
