package com.xuliwen.dm.strategy;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/4/30.
 */

public class Circle implements BaseShape {
    @Override
    public void shape() {
        //用于测试
        Log.e(Constants.TAG,"我是圆形");
    }
}
