package com.xuliwen.dm.proxy.dynamicproxy;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/2.
 *
 * 委托类2
 */

public class RealSubject2 implements Subject2 {
    @Override
    public void rent()
    {
        Log.e(Constants.TAG,"RealSubject2:I want to rent my house ");
    }

    @Override
    public void hello(String str)
    {
        Log.e(Constants.TAG,"RealSubject2: hello: " + str);
    }
}
