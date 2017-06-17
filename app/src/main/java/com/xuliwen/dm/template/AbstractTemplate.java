package com.xuliwen.dm.template;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/11.
 * 抽象模板
 */

public abstract class AbstractTemplate {

    /**
     * 封装好的算法：
     * 共有四个步骤： 步骤1是固定的；步骤2，步骤3是必须让子类实现的；步骤4是让子类选择实现的
     */
    public void operate(){
        step1();
        step2();
        step3();
        step4();
    }

    /**
     * step1是固定的，所以定义为final
     */
    final void step1(){
        Log.e(Constants.TAG,"模板方法：AbstractTemplate step1");
    }

    /**
     * step2是必须让子类实现的，所以定义为abstract
     */
    abstract void step2();

    /**
     * step3是必须让子类实现的，所以定义为abstract
     */
    abstract void step3();

    void step4(){
        Log.e(Constants.TAG,"模板方法：AbstractTemplate step4");
    }

}
