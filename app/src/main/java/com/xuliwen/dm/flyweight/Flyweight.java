package com.xuliwen.dm.flyweight;

/**
 * Created by xlw on 2017/5/10.
 * 抽象享元接口，定义每个享元共有的接口
 */

public interface Flyweight {
    //一个示意性方法，参数state是外蕴状态
    public void operation(String state);
}
