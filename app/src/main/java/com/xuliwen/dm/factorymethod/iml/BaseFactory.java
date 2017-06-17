package com.xuliwen.dm.factorymethod.iml;


/**
 * Created by xlw on 2017/4/30.
 * 1. 写法：声明一个工厂接口类，产品接口类，每个具体产品（实现了产品接口）对应一个具体工厂类（实现了
 *          工厂接口），当要创建产品时，就调用具体工厂类的方法
 *
 * 2. 优点：
 * 1） 请看简单工厂方法
 * 2） 相比于简单工厂，工厂方法的优点是更容易扩展
 *
 * 3. Android中的应用：java集合框架
 *
 * 4. 适用场景： 同简单工厂
 */

public interface BaseFactory {
    BaseShape getShape();
}
