package com.xuliwen.dm.iterator;

/**
 * Created by xlw on 2017/5/10.
 * 容器接口类
 */

public interface Aggregation<T> {

    void add(T obj);

    void remove(T obj);

    Iterator<T> iterator();
}