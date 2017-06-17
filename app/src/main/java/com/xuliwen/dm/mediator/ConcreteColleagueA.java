package com.xuliwen.dm.mediator;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/11.
 * 同事A
 */

public class ConcreteColleagueA extends Colleague {
    public void opreateB(){
        mediator.operateB();
    }

    @Override
    void operate() {
        Log.e(Constants.TAG,"中介者模式： 我是ConcreteColleagueA");
    }
}
