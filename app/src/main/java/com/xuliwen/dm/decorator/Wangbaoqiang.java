package com.xuliwen.dm.decorator;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/1.
 *
 * 被装饰类
 */

public class Wangbaoqiang implements Star {
    @Override
    public void movieShow(int money) {
        Log.e(Constants.TAG,"装饰模式： 王宝强拍电影："+money+"元");
    }
}
