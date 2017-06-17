package com.xuliwen.dm.responsibilitychain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xuliwen.dm.R;

public class ResponsibilityChainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responsibility_chain);
        responsibilitychain();
    }

    private void responsibilitychain(){
        AbstractHandler handler1 = new ConcreteHandler1();
        AbstractHandler handler2 = new ConcreteHandler2();
        handler1.nextHandler = handler2;

        AbstractRequest request1 = new ConcreteRequest1("request1");
        AbstractRequest request2 = new ConcreteRequest2("request2");

        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
    }
}
