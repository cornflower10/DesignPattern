package com.design.pattern.Chain;

/**
 * Created by xiejingbao on 2018/6/29.
 */

public abstract class Interceptor {
    protected Interceptor interceptor;

    public void setInterceptor(Interceptor interceptor) {
        this.interceptor = interceptor;
    }

    public void doChain(){
        doSometing();
        if(null!=interceptor){
            interceptor.doChain();
        }
    }

    protected abstract void doSometing();
}
