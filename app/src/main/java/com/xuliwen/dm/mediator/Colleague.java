package com.xuliwen.dm.mediator;

/**
 * Created by xlw on 2017/5/11.
 * 同事接口
 */

public abstract class Colleague {
     Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void operate();



}
