package com.xuliwen.dm.factorymethod;

import com.xuliwen.dm.factorymethod.iml.BaseFactory;
import com.xuliwen.dm.factorymethod.iml.BaseShape;

/**
 * Created by xlw on 2017/4/30.
 */

public class CircleFactory implements BaseFactory {
    @Override
    public BaseShape getShape() {
        return new Circle();
    }
}
