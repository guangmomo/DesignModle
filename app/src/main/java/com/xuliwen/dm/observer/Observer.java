package com.xuliwen.dm.observer;

/**
 * Created by xlw on 2017/4/30.
 * 观察者
 *
 * 写法：提供一个方法onUpdate让被观察者调用，从而被观擦者可以通过这个方法来通知观察者
 */

public interface Observer<T> {//使用泛型的原因：使观察者模式具有扩展性，T代表的是 被观察者要通知观察者的 数据类型，这样数据类型可以是任意类型

    /**
     * 接收被观察者的通知，做出相应的操作
     * @param observable 被观察者
     * @param data  从被观察者传过来的数据
     */
    void onUpdate(Observable<T> observable,T data);
}
