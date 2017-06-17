package com.xuliwen.dm.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xlw on 2017/4/30.
 * 被观察者
 *
 * 1. 写法：
 * 1）用List来存储注册的观察者
 * 2）注册观察者：将观察者添加到List
 * 3）解除注册： 将观察者从List中移除
 * 4）通知观察者：notifyObservers()中调用观察者暴露的方法
 *
 *
 * 2. 安卓的应用场景：
 * 1） button的监听事件，可以看做一对一的观察者模式（回调），btn是被观擦者，OnClickListener是观擦者
 * 2）RecycleView的滚动监听
 * 3）广播
 *
 * 3. 优点：
 * 松耦合，代码清晰
 *
 * 4. 适用场景：
 * 1）监听回调
 */

public class Observable<T> {//
    List<Observer<T>> mObservers = new ArrayList<>();//要通知的观察者，用List来存储注册的观察者


    /**
     * 注册观察者：将观察者添加到List
     * @param observer
     */
    public void register(Observer<T> observer) {
        if (observer == null) {  //判断观察者是否为null
            throw new NullPointerException("observer == null");
        }
        synchronized (this) {
            if (!mObservers.contains(observer))//避免重复添加
                mObservers.add(observer);
        }
    }

    /**
     * 解除注册： 将观察者从List中移除
     * @param observer
     */
    public synchronized void unregister(Observer<T> observer) {
        mObservers.remove(observer);
    }

    /**
     * 通知观察者：notifyObservers()中调用观察者暴露的onUpdate方法，将data传给观察者，观察者拿到data后，就可以做出相应的操作了
     * @param data
     */
    public void notifyObservers(T data) {
        for (Observer<T> observer : mObservers) { //通知所有的观察者
            observer.onUpdate(this, data);
        }
    }

}
