package com.design.pattern.proxy;

import android.util.Log;

/**
 * Created by xiejingbao on 2018/6/27.
 */

public class RealProxy implements IProxy {
    @Override
    public void showImage() {
        Log.i("RealProxy","showImage");
    }
}
