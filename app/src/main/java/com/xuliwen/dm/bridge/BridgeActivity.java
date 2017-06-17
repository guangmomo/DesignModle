package com.xuliwen.dm.bridge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xuliwen.dm.R;

public class BridgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);
        bridge();
    }

    private void bridge() {
        T50 t50 = new T50();
        t50.setmPlatform(new TV());
        t50.shot();
        t50.setmPlatform(new PC());
        t50.shot();

        T90 t90 = new T90();
        t90.setmPlatform(new TV());
        t90.shot();
        t90.setmPlatform(new PC());
        t90.shot();


    }
}
