package com.xuliwen.dm.adapter.objectadapter;

/**
 * Created by xlw on 2017/5/1.
 * 类适配器
 * 1. 写法：通过继承适配者的方法来持有适配者，实现目标接口
 *
 * 2. 缺点： 只能持有一个适配者，而且如果适配者是final类，那么将不能被继承
 *          目标类只能是一个接口，不能是抽象类
 */

public class ClassAdapter extends Japanese implements TargetIml {
    @Override
    public String translateEnglish(String txt) {
        return "通过类适配器最多只能适配一个适配者";
    }

    @Override
    public String translateJapanese(String txt) {
        return japanese(txt);
    }
}
