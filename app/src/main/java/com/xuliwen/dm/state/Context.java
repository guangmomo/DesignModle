package com.xuliwen.dm.state;

/**
 * Created by xlw on 2017/5/11.
 * 环境类，暴露客户端要调用的接口
 */

public class Context {

    private int count=20;

    //环境类的当前状态
    private State mCurrentState;

    public State getmCurrentState() {
        return mCurrentState;
    }

    public void setmCurrentState(State mCurrentState) {
        this.mCurrentState = mCurrentState;
    }



    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }



    public Context(){
        mCurrentState=new WaterState();
    }

    public void drink(){
        mCurrentState.doSomething(this);
    }




}
