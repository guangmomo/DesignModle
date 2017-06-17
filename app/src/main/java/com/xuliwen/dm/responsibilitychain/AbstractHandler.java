package com.xuliwen.dm.responsibilitychain;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/10.
 */

public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;

    public final void handleRequest(AbstractRequest request) {
        if (getHandlerLevel() == request.getLevel()) {
            handle(request);
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                Log.e(Constants.TAG,"there is no handler that can handle this request");
            }
        }
    }

    protected abstract int getHandlerLevel();

    protected abstract void handle(AbstractRequest request);
}
