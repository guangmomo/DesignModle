package com.xuliwen.dm.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xlw on 2017/5/10.
 * 用于创建享元的工厂方法，用单例模式实现
 */

public class FlyweightFactory {
    private static FlyweightFactory flyweightFactory;

    private FlyweightFactory(){}

    public static FlyweightFactory getInstance(){
        if(flyweightFactory==null){
            flyweightFactory=new FlyweightFactory();
        }
        return flyweightFactory;
    }


    /**
     * 要共享的享元，使用hashmap来存储，这样能通过get(key)来判断一个享元是不是已经创建过了
     */
    private Map<Character,Flyweight> files = new HashMap<Character,Flyweight>();


    /**
     * 复合享元工厂方法
     */
    public Flyweight factory(List<Character> compositeState){
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();

        for(Character state : compositeState){
            compositeFly.add(state,this.factory(state));
        }

        return compositeFly;
    }

    /**
     * 单纯享元工厂方法
     */
    public Flyweight factory(Character state){
        //先从缓存中查找对象
        Flyweight fly = files.get(state);
        if(fly == null){
            //如果对象不存在则创建一个新的Flyweight对象
            fly = new ConcreteFlyweight(state);
            //把这个新的Flyweight对象添加到缓存中
            files.put(state, fly);
        }
        return fly;
    }


}
