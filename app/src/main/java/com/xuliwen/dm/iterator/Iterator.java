package com.xuliwen.dm.iterator;

/**
 * Created by xlw on 2017/5/10.
 * 迭代器接口
 */

public interface Iterator<T> {
    boolean hasNext();

    T next();
}
