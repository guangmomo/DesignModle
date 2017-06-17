package com.xuliwen.dm.abstractfactory.shape.red;

import android.util.Log;

import com.xuliwen.dm.Constants;
import com.xuliwen.dm.abstractfactory.iml.Shape;

/**
 * Created by xlw on 2017/5/1.
 */

public class RedPath implements Shape {
    @Override
    public void print() {
        Log.e(Constants.TAG,"我是RedPath");
    }
}
