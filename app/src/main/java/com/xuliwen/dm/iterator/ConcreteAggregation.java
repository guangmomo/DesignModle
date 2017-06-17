package com.xuliwen.dm.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xlw on 2017/5/10.
 * 容器的具体实现
 */

public class ConcreteAggregation<T> implements Aggregation<T>{
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(list);
    }
}
