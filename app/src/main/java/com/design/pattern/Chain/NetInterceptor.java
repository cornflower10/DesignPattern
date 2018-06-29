package com.design.pattern.Chain;

import android.util.Log;

/**
 * Created by xiejingbao on 2018/6/29.
 */

public class NetInterceptor extends Interceptor {
    @Override
    protected void doSometing() {
        Log.i("NetInterceptor","NetInterceptor.....");
    }
}
