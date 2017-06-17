package com.xuliwen.dm.memento;

/**
 * Created by xlw on 2017/5/10.
 * 白箱模式的写法：
 * Memento暴露给外界，除了Original，其他类也可以操作Memento，破坏了封装性
 *
 *
 * 备忘录类，是一个javaBean，成员变量是需要备忘的属性
 */

public class WhiteMemento {
    public int getmState() {
        return mState;
    }

    public void setmState(int mState) {
        this.mState = mState;
    }

    private int mState;
    //省略其他需要备忘的属性

}
