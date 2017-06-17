package com.xuliwen.dm.flyweight;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/10.
 * 具体的享元类
 */

public class ConcreteFlyweight implements Flyweight {
    private Character intrinsicState = null;
    /**
     * 构造函数，内蕴状态作为参数传入，内蕴状态要求在对象被创建后就不能再改变
     * @param state
     */
    public ConcreteFlyweight(Character state){
        this.intrinsicState = state;
    }


    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String state) {
        Log.e(Constants.TAG,"Intrinsic State = " + this.intrinsicState);
        Log.e(Constants.TAG,"Extrinsic State = " + state);
    }

}
