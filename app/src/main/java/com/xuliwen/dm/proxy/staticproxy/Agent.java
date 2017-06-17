package com.xuliwen.dm.proxy.staticproxy;

import android.util.Log;

import com.xuliwen.dm.Constants;
import com.xuliwen.dm.proxy.dynamicproxy.Subject1;

/**
 * Created by xlw on 2017/5/1.
 * 静态代理类
 *
 * 写法：
 *
 * 代理类和委托类实现同一个代理接口，代理持有委托类作为成员变量，这样代理在调用委托类的方法之前或者之后做些处理
 */

public class Agent implements Star{

    private Star star;

    public Agent(){
        star=new Wangbaoqiang();
    }


    /**
     * 方法增强，当金额大于30000000的时候，才会调用被代理者
     * @param money
     */
    @Override
    public void movieShow(int money) {
        if(money<30000000){
            Log.e(Constants.TAG,"静态代理： 才"+money+"元，宝强不接");
        }else {
            star.movieShow(money);
        }
    }

}
