package com.xuliwen.dm.template;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/11.
 * 具体模板B
 */

public class ConcreteTemplateB extends AbstractTemplate {
    @Override
    void step2() {
        Log.e(Constants.TAG,"模板方法：ConcreteTemplateB step2");
    }

    @Override
    void step3() {
        Log.e(Constants.TAG,"模板方法：ConcreteTemplateB step3");
    }

    @Override
    void step4() {
        Log.e(Constants.TAG,"模板方法：ConcreteTemplateB step4");
    }
}
