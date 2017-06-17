package com.xuliwen.dm.composite;

/**
 * Created by xlw on 2017/5/10.
 *  抽象类接口  Component
 */

public abstract class Component {
    public abstract int getChildNum();
    public abstract String getName();
    public abstract String getType();
    public abstract void add(Component c);
    public abstract void remove(Component c);
}
