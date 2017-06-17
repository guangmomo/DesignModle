package com.xuliwen.dm.template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xuliwen.dm.R;

public class TemplateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);
        template();
    }

    private void template(){
        new ConcreteTemplateA().operate();
        new ConcreteTemplateB().operate();
    }
}
