package com.xuliwen.dm.responsibilitychain;

/**
 * Created by xlw on 2017/5/10.
 */

public class ConcreteRequest2 extends AbstractRequest{

    public ConcreteRequest2(Object object) {
        super(object);
    }

    @Override
    public int getLevel() {
        return 2;
    }
}
