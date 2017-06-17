package com.xuliwen.dm.memento;

/**
 * Created by xlw on 2017/5/10.
 * 存储备忘录的类，只提供set，get方法，不能修改备忘录的内容
 * 是一个javaBean，成员变量是备忘录
 */

public class WhiteStorage {
    private WhiteMemento whiteMemento;

    /**
     * 获取备忘录
     * @return
     */
    public WhiteMemento getWhiteMemento() {
        return whiteMemento;
    }

    /**
     * 存储备忘录
     * @param whiteMemento
     */
    public void setWhiteMemento(WhiteMemento whiteMemento) {
        this.whiteMemento = whiteMemento;
    }
}
