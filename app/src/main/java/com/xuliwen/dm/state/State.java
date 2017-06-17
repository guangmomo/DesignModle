package com.xuliwen.dm.state;

/**
 * Created by xlw on 2017/5/11.
 * 状态接口
 */

public interface State {

    /**
     * 不同的状态做不同的操作
     * @param context State包含对Context的引用，这样能够根据Context的情况来跳转到别的状态（
     *                比如根据Context中的水量count是否大于0来跳转到NullState）
     */
    void doSomething(Context context);
}
