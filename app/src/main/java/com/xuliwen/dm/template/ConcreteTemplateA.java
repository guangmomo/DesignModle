package com.xuliwen.dm.template;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/11.
 * 具体模板A
 */

public class ConcreteTemplateA extends AbstractTemplate {



    @Override
    void step2() {
        Log.e(Constants.TAG,"模板方法：ConcreteTemplateA step2");
    }

    @Override
    void step3() {
        Log.e(Constants.TAG,"模板方法：ConcreteTemplateA step3");
    }
}
