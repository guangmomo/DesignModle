package com.xuliwen.dm.mediator;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/11.
 * 同事B
 */

public class ConcreteColleagueB extends Colleague {
    public void opreateB(){
        mediator.operateA();
    }

    @Override
    void operate() {
        Log.e(Constants.TAG,"中介者模式： 我是ConcreteColleagueB");
    }
}
