package com.xuliwen.dm.responsibilitychain;

/**
 * Created by xlw on 2017/5/10.
 */

public abstract class AbstractRequest {

    private Object object;

    public AbstractRequest(Object object) {
        this.object = object;
    }

    public Object getContent() {
        return object;
    }

    public abstract int getLevel();
}
