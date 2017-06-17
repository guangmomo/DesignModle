package com.xuliwen.dm.adapter.objectadapter;

/**
 * Created by xlw on 2017/5/1.
 * 对象适配器
 * 1. 写法：适配器可以持有多个适配者作为成员变量，实现目标接口
 *
 * 2. 优点：一个适配器可以持有多个适配者
 *
 */

public class ObjectAdapter implements TargetIml {
    private English english; //适配者
    private Japanese japanese; //适配者

    public ObjectAdapter(){
        english=new English();
        japanese=new Japanese();
    }


    @Override
    public String translateEnglish(String txt) {
        return english.english(txt);
    }

    @Override
    public String translateJapanese(String txt) {
       return japanese.japanese(txt);
    }
}
