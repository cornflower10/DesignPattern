package com.design.pattern.proxy.dyproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by xiejingbao on 2018/6/27.
 */

public class DyInvocationHandler implements InvocationHandler {
    private Object object;
    public DyInvocationHandler(Object object){
        this.object = object;
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        return  method.invoke(object,objects);

    }
}
