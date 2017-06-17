package com.xuliwen.dm.factorymethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xuliwen.dm.R;

public class FactoryMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_method);
        factoryMethod();
    }

    private void factoryMethod(){
        com.xuliwen.dm.factorymethod.iml.BaseShape baseShape=new CircleFactory().getShape();
        baseShape.shape();
        baseShape=new LineFactory().getShape();
        baseShape.shape();
        baseShape=new PathFactory().getShape();
        baseShape.shape();
    }
}
