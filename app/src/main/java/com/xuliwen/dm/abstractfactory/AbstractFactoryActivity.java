package com.xuliwen.dm.abstractfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xuliwen.dm.R;
import com.xuliwen.dm.abstractfactory.factory.BlueFactory;
import com.xuliwen.dm.abstractfactory.factory.RedFactory;
import com.xuliwen.dm.abstractfactory.iml.Shape;

public class AbstractFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);
        abstractFactory();
    }

    private void abstractFactory(){
        Shape shape=new RedFactory().createLine();
        shape.print();
        shape=new RedFactory().createPath();
        shape.print();
        shape=new BlueFactory().createLine();
        shape.print();
        shape=new BlueFactory().createPath();
        shape.print();
    }
}
