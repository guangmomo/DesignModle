package com.xuliwen.dm.simplefactory;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/4/30.
 */

public class Path implements BaseShape {
    @Override
    public void shape() {
        Log.e(Constants.TAG,"我是曲线");
    }
}
