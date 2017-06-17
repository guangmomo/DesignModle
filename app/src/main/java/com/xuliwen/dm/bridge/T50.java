package com.xuliwen.dm.bridge;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/10.
 */

public class T50 extends Tank {

    public Platform mPlatform=new TV();

    @Override
    public void shot() {
        Log.e(Constants.TAG,"桥接模式：T50：shot");
        mPlatform.platformName();
    }

    @Override
    public void run() {
        Log.e(Constants.TAG,"桥接模式：T50：run");
        mPlatform.platformName();
    }

    public void test(){}
}
