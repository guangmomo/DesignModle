package com.xuliwen.dm.proxy.staticproxy;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/1.
 *
 * 委托类
 */

public class Wangbaoqiang implements Star {
    @Override
    public void movieShow(int money) {
        Log.e(Constants.TAG,"静态代理： 王宝强拍电影："+money+"元");
    }
}
