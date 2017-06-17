package com.xuliwen.dm.decorator;

import android.util.Log;

import com.xuliwen.dm.Constants;
import com.xuliwen.dm.proxy.dynamicproxy.Subject1;

/**
 * Created by xlw on 2017/5/1.
 * 装饰类
 *
 * 写法：
 *
 * 装饰类和被装饰类实现同一个装饰接口，在Agent中被装饰类作为构造方法的参数传递进来（与静态代理的区别）
 */

public class Agent implements Star{

    private Star star;

    public Agent(Star start){
        this.star=start;
    }


    /**
     * 方法增强，当金额大于30000000的时候，宝强才接电影（对Wangbaoqiang这个类作了一层装饰）
     * @param money
     */
    @Override
    public void movieShow(int money) {
        if(money<30000000){
            Log.e(Constants.TAG,"装饰模式： 才"+money+"元，宝强不接");
        }else {
            star.movieShow(money);
        }
    }

}
