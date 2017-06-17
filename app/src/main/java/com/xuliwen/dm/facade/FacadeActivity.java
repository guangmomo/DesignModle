package com.xuliwen.dm.facade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xuliwen.dm.R;

public class FacadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade);
        facade();
    }

    private void facade(){
        Computer computer=new Computer();
        computer.startup();
        computer.shutdown();
    }
}
