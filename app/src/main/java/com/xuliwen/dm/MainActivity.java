package com.xuliwen.dm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.xuliwen.dm.abstractfactory.AbstractFactoryActivity;
import com.xuliwen.dm.adapter.objectadapter.ObjectAdapterActivity;
import com.xuliwen.dm.bridge.BridgeActivity;
import com.xuliwen.dm.builder.BuilderActivity;
import com.xuliwen.dm.clone.CloneActivity;
import com.xuliwen.dm.composite.CompositeActivity;
import com.xuliwen.dm.decorator.DecoratorActivity;
import com.xuliwen.dm.factorymethod.FactoryMethodActivity;
import com.xuliwen.dm.flyweight.FlyweightActivity;
import com.xuliwen.dm.iterator.IteratorActivity;
import com.xuliwen.dm.mediator.MediatorActivity;
import com.xuliwen.dm.memento.MementoActivity;
import com.xuliwen.dm.observer.ObserverActivity;
import com.xuliwen.dm.proxy.ProxyActivity;
import com.xuliwen.dm.responsibilitychain.ResponsibilityChainActivity;
import com.xuliwen.dm.simplefactory.SimpleFactoryActivity;
import com.xuliwen.dm.state.StateActivity;
import com.xuliwen.dm.strategy.StrategyActivity;
import com.xuliwen.dm.template.TemplateActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toClone(View view) {
        startActivity(new Intent(MainActivity.this, CloneActivity.class));
    }

    public void toObserver(View view) {
        startActivity(new Intent(MainActivity.this, ObserverActivity.class));
    }

    public void toBuilder(View view) {
        startActivity(new Intent(MainActivity.this, BuilderActivity.class));
    }

    public void toStrategy(View view) {
        startActivity(new Intent(MainActivity.this, StrategyActivity.class));
    }

    public void toSimpleFactory(View view) {
        startActivity(new Intent(MainActivity.this, SimpleFactoryActivity.class));
    }

    public void toFactoryMethod(View view) {
        startActivity(new Intent(MainActivity.this, FactoryMethodActivity.class));
    }

    public void toAbstractFactory(View view) {
        startActivity(new Intent(MainActivity.this, AbstractFactoryActivity.class));
    }

    public void toAdapter(View view) {
        startActivity(new Intent(MainActivity.this, ObjectAdapterActivity.class));
    }

    public void toProxy(View view) {
        startActivity(new Intent(MainActivity.this, ProxyActivity.class));
    }

    public void toDecorator(View view) {
        startActivity(new Intent(MainActivity.this, DecoratorActivity.class));
    }

    public void toBridge(View view) {
        startActivity(new Intent(MainActivity.this, BridgeActivity.class));
    }

    public void toComposite(View view) {
        startActivity(new Intent(MainActivity.this, CompositeActivity.class));
    }

    public void toFlyweight(View view) {
        startActivity(new Intent(MainActivity.this, FlyweightActivity.class));
    }

    public void toIterator(View view) {
        startActivity(new Intent(MainActivity.this, IteratorActivity.class));
    }

    public void toResponsibilityChain(View view) {
        startActivity(new Intent(MainActivity.this, ResponsibilityChainActivity.class));
    }

    public void toMemento(View view) {
        startActivity(new Intent(MainActivity.this, MementoActivity.class));
    }

    public void toState(View view) {
        startActivity(new Intent(MainActivity.this, StateActivity.class));
    }

    public void toMediator(View view) {
        startActivity(new Intent(MainActivity.this, MediatorActivity.class));
    }

    public void toTemplate(View view) {
        startActivity(new Intent(MainActivity.this, TemplateActivity.class));
    }
}
