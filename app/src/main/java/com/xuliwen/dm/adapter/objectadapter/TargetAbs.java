package com.xuliwen.dm.adapter.objectadapter;

/**
 * Created by xlw on 2017/5/1.
 * 接口适配器
 * 1. 写法： 定义一个抽象类TargetAbs实现目标接口TargetIml，并实现TargetIml的目标方法
 *           那么当适配器继承TargetAbs的时候，就不需要实现所有的目标方法了
 *
 * 2. 优点： 适配器不需要实现所有目标方法
 */

public abstract class TargetAbs implements TargetIml {
    @Override
    public String translateEnglish(String txt) {
        return "translateEnglish默认实现";
    }

    @Override
    public String translateJapanese(String txt) {
        return "translateJapanese默认实现";
    }
}
