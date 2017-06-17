package com.xuliwen.dm.memento;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/10.
 * 白箱模式
 * 发起备忘录的类
 */

public class WhiteOriginal {
    private int mState;
    //省略其他需要备忘的属性

    private WhiteMemento mWhiteMemento;

    public int getmState() {
        return mState;
    }

    public void setmState(int mState) {
        this.mState = mState;
    }

    /**
     * 根据Original当前的状态去创建一个备忘录
     * @return
     */
    public WhiteMemento createMemento(){
        mWhiteMemento =new WhiteMemento();
        mWhiteMemento.setmState(mState);
        return mWhiteMemento;
    }

    /**
     * 根据备忘录恢复属性
     * @param whiteMemento
     */
    public void restore(WhiteMemento whiteMemento){
        mState= whiteMemento.getmState();
    }

    public void print(){
        Log.e(Constants.TAG,"备忘录模式：state=="+mState);
    }



}
