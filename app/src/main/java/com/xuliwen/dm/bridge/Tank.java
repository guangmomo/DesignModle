package com.xuliwen.dm.bridge;

/**
 * Created by xlw on 2017/5/10.
 */

public abstract class Tank {
    protected Platform mPlatform;

    public void setmPlatform(Platform platform){
        mPlatform=platform;
    }

    public abstract void shot();

    public abstract void run();
}
