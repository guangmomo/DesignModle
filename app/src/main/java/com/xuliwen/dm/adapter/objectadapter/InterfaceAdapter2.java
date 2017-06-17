package com.xuliwen.dm.adapter.objectadapter;

/**
 * Created by xlw on 2017/5/1.
 * 接口适配器2，只实现了translateJapanese
 */

public class InterfaceAdapter2 extends TargetAbs {
    private Japanese japanese;

    public InterfaceAdapter2(){
        japanese=new Japanese();
    }

    @Override
    public String translateJapanese(String txt) {
        return japanese.japanese(txt);
    }
}
