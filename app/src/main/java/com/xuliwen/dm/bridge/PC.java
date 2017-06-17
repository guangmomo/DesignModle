package com.xuliwen.dm.bridge;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/10.
 */

public class PC extends Platform {
    @Override
    public void platformName() {
        Log.e(Constants.TAG,"桥接模式：PC");
    }
}
