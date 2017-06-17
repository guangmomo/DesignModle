package com.xuliwen.dm.adapter.objectadapter;

/**
 * Created by xlw on 2017/5/1.
 * 对象适配器的目标接口：定义目标方法（即适配器暴露给客户端调用的方法）
 */

public interface TargetIml {
    String translateEnglish(String txt);
    String translateJapanese(String txt);
}
