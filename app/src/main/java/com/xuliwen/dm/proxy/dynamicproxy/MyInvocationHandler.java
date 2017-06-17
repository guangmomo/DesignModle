package com.xuliwen.dm.proxy.dynamicproxy;

import android.util.Log;

import com.xuliwen.dm.Constants;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by xlw on 2017/5/2.
 * 自定义调用处理器
 *
 * 写法：
 * 1. 写一个类继承InvocationHandler
 * 2. 构造方法将真实对象传进来
 * 3. invoke()中去调用委托类的方法
 *
 */

public class MyInvocationHandler implements InvocationHandler {

    //实际被代理的对象
    private Object targetObject;

    public Object newProxyInstance(Object targetObject){
        this.targetObject=targetObject;
        //该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
        //第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
        //第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口
        //第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
        //根据传入的目标返回一个代理对象，ClassName格式：$Proxy0
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),this);
    }


    /**
     *  代理调用接口方法，最终会跳转到MyInvocationHandler的invoke中处理
     * @param proxy 代理
     * @param method  被代理对象的某个方法
     * @param args    被代理对象的某个方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //　　在代理真实对象前我们可以添加一些自己的操作
        String tag=null;
        if(targetObject instanceof RealSubject1){
            tag="RealSubject1";
        }else if(targetObject instanceof RealSubject2){
            tag="RealSubject2";
        }

        Log.e(Constants.TAG,tag+" 动态代理： before rent house");
        Log.e(Constants.TAG,tag+" 动态代理：Method:" + method);

        method.invoke(targetObject,args);

        //　　在代理真实对象后我们也可以添加一些自己的操作
        Log.e(Constants.TAG,tag+" after rent house");
        return null;

    }
}
