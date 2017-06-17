package com.xuliwen.dm.adapter.objectadapter;

/**
 * Created by xlw on 2017/5/1.
 * 接口适配器1，只实现了translateEnglish
 */

public class InterfaceAdapter1 extends TargetAbs {
    private English english;

    public InterfaceAdapter1(){
        english=new English();
    }

    @Override
    public String translateEnglish(String txt) {
        return english.english(txt);
    }
}
