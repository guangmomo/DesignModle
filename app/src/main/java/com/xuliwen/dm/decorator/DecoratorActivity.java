package com.xuliwen.dm.decorator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xuliwen.dm.R;

public class DecoratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator);
        decorator();
    }

    private void decorator(){
        Agent agent=new Agent(new Wangbaoqiang());
        agent.movieShow(30);
        agent.movieShow(400000000);
    }
}
