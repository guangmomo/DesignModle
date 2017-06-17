package com.xuliwen.dm.responsibilitychain;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/10.
 */

public class ConcreteHandler1 extends AbstractHandler{
    @Override
    protected int getHandlerLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        Log.e(Constants.TAG,"ConcreteHandler1 handle this request : " + request.getContent() + "\n");
    }
}
