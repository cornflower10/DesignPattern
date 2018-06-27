package com.design.pattern.proxy;

/**
 * Created by xiejingbao on 2018/6/27. 代理类
 */

public class Proxy implements IProxy {
    private IProxy realProxy;
    public Proxy(){
        realProxy = new RealProxy();
    }
    @Override
    public void showImage() {
        realProxy.showImage();
    }
}
