package com.xuliwen.dm.state;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/11.
 * 有水的状态
 */

public class WaterState implements State {


    @Override
    public void doSomething(Context context) {
        int count=context.getCount();
        if(count>1){
            context.setCount(--count);
            Log.e(Constants.TAG,"状态模式: 喝水,水量剩余："+count);
        }else if(count==1){
            context.setCount(--count);
            Log.e(Constants.TAG,"状态模式: 喝水,水量剩余："+count);
            context.setmCurrentState(new NullState());
        }

    }
}
