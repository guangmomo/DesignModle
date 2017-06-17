package com.xuliwen.dm.bridge;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/10.
 */

public class T90 extends Tank {
    @Override
    public void shot() {
        Log.e(Constants.TAG,"桥接模式：T90：shot");
        mPlatform.platformName();
    }

    @Override
    public void run() {
        Log.e(Constants.TAG,"桥接模式：T90：run");
        mPlatform.platformName();
    }
}
