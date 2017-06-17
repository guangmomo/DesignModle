package com.xuliwen.dm.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xuliwen.dm.R;

public class StrategyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);
        strategy();
    }

    private void strategy(){
        ShapeModel model=new ShapeModel();
        model.setBaseShape(new Line());
        model.shape();
        model.setBaseShape(new Path());
        model.shape();
        model.setBaseShape(new Circle());
        model.shape();
    }
}
