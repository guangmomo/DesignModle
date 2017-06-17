package com.xuliwen.dm.simplefactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xuliwen.dm.R;
import com.xuliwen.dm.strategy.*;

public class SimpleFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_factory);
        simpleFactory();
    }

    private void simpleFactory(){
        BaseShape baseShape=SimpleFactory.getShape("line");
        baseShape.shape();
        baseShape=SimpleFactory.getShape("circle");
        baseShape.shape();
        baseShape=SimpleFactory.getShape("path");
        baseShape.shape();
    }
}
