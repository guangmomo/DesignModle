package com.xuliwen.dm.flyweight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.xuliwen.dm.Constants;
import com.xuliwen.dm.R;

import java.util.ArrayList;
import java.util.List;

public class FlyweightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyweight);
        singleFlyweight();
        compositeFlyweight();
    }

    private void singleFlyweight() {
        FlyweightFactory factory = FlyweightFactory.getInstance();
        Flyweight fly1 = factory.factory('a');
        fly1.operation("First Call");

        Flyweight fly2 = factory.factory('a');
        fly2.operation("Second Call");

        Flyweight fly3 = factory.factory('c');
        fly3.operation("Third Call");

        Log.e(Constants.TAG, "fly1==fly2：" + (fly1 == fly2));//返回true，说明fly1和fly2是同一个对象
        Log.e(Constants.TAG, "fly1==fly3：" + (fly1 == fly3));

    }


    private void compositeFlyweight(){
        List<Character> compositeState = new ArrayList<Character>();
        compositeState.add('a');
        compositeState.add('b');
        compositeState.add('c');
        compositeState.add('a');
        compositeState.add('b');

        FlyweightFactory flyFactory = FlyweightFactory.getInstance();
        Flyweight compositeFly1 = flyFactory.factory(compositeState);
        Flyweight compositeFly2 = flyFactory.factory(compositeState);
        compositeFly1.operation("Composite Call");

       Log.e(Constants.TAG,"复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));

        Character state = 'a';
        Flyweight fly1 = flyFactory.factory(state);
        Flyweight fly2 = flyFactory.factory(state);
        Log.e(Constants.TAG,"单纯享元模式是否可以共享对象：" + (fly1 == fly2));
    }


}
