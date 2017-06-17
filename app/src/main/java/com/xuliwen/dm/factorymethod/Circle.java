package com.xuliwen.dm.factorymethod;

import android.util.Log;

import com.xuliwen.dm.Constants;
import com.xuliwen.dm.factorymethod.iml.BaseShape;


/**
 * Created by xlw on 2017/4/30.
 */

public class Circle implements BaseShape {
    @Override
    public void shape() {
        Log.e(Constants.TAG,"我是圆形");
    }
}
