package com.xuliwen.dm.state;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/11.
 * 没有水的状态
 */

public class NullState implements State {
    @Override
    public void doSomething(Context context) {
        Log.e(Constants.TAG,"状态模式: 没有水了");
    }
}
