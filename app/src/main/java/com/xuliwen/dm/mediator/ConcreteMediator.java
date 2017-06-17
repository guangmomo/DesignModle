package com.xuliwen.dm.mediator;

import java.lang.ref.PhantomReference;

/**
 * Created by xlw on 2017/5/11.
 * 具体的中介者
 */

public class ConcreteMediator implements Mediator {
    private ConcreteColleagueA concreteColleagueA;
    private ConcreteColleagueB concreteColleagueB;

    public ConcreteMediator(ConcreteColleagueA concreteColleagueA, ConcreteColleagueB concreteColleagueB){
        this.concreteColleagueA=concreteColleagueA;
        this.concreteColleagueB=concreteColleagueB;
    }

    @Override
    public void operateA() {
        concreteColleagueA.operate();
    }

    @Override
    public void operateB() {
        concreteColleagueB.operate();
    }
}
