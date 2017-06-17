package com.xuliwen.dm.state;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xuliwen.dm.R;

public class StateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);
        state();
    }

    private void state(){
        Context context=new Context();
        for(int i=0;i<30;i++){
            context.drink();
        }
    }
}
