package com.xuliwen.dm.proxy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.xuliwen.dm.Constants;
import com.xuliwen.dm.R;
import com.xuliwen.dm.proxy.dynamicproxy.MyInvocationHandler;
import com.xuliwen.dm.proxy.dynamicproxy.RealSubject1;
import com.xuliwen.dm.proxy.dynamicproxy.RealSubject2;
import com.xuliwen.dm.proxy.dynamicproxy.Subject1;
import com.xuliwen.dm.proxy.dynamicproxy.Subject2;
import com.xuliwen.dm.proxy.staticproxy.Agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
      //  staticProxy();
        dynamicProxy();
    }

    private void staticProxy(){
        Agent agent =new Agent();
        agent.movieShow(30);
        agent.movieShow(40000000);

    }

    private void dynamicProxy(){
        RealSubject1 realSubject1=new RealSubject1();

        //将代理转换成Subject1，因为代理实现了Subject1接口
        Subject1 subject1=(Subject1)new MyInvocationHandler().newProxyInstance(realSubject1);
        Log.e(Constants.TAG,subject1.getClass().getName());
        Log.e(Constants.TAG,realSubject1.getClass().getName());

        /**
         * 通过代理对象调用接口中定义的方法，会跳转到InvocationHandler中去执行invoke()，
         */
        subject1.rent();
        subject1.hello("world");

        RealSubject2 realSubject2=new RealSubject2();

        //将代理转换成Subject1，因为代理实现了Subject1接口
        Subject2 subject2=(Subject2)new MyInvocationHandler().newProxyInstance(realSubject2);
        Log.e(Constants.TAG,subject2.getClass().getName());

        /**
         * 通过代理对象调用接口中定义的方法，会跳转到InvocationHandler中去执行invoke()，
         */
        subject2.rent();
        subject2.hello("world");

    }
}
