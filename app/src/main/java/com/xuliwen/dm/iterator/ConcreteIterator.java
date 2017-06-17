package com.xuliwen.dm.iterator;

import java.util.List;

/**
 * Created by xlw on 2017/5/10.
 * 迭代器的具体实现
 */

public class ConcreteIterator<T> implements Iterator<T>{
    private List<T> list;
    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T obj = null;
        if (this.hasNext()) {
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
