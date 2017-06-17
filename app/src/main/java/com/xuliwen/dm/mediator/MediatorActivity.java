package com.xuliwen.dm.mediator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xuliwen.dm.R;

public class MediatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator);
        mediator();
    }

    private void mediator(){
         ConcreteColleagueA concreteColleagueA=new ConcreteColleagueA();
        ConcreteColleagueB concreteColleagueB=new ConcreteColleagueB();
        ConcreteMediator concreteMediator =new ConcreteMediator(concreteColleagueA,concreteColleagueB);
        concreteColleagueA.setMediator(concreteMediator);
        concreteColleagueB.setMediator(concreteMediator);
        concreteMediator.operateA();
        concreteMediator.operateB();
    }
}
