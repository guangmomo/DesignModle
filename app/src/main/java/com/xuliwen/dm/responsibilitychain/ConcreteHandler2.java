package com.xuliwen.dm.responsibilitychain;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/10.
 */

public class ConcreteHandler2 extends AbstractHandler{
    @Override
    protected int getHandlerLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        Log.e(Constants.TAG,"ConcreteHandler2 handle this request : " + request.getContent() + "\n");
    }
}
