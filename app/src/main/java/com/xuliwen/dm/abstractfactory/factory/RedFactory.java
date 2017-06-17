package com.xuliwen.dm.abstractfactory.factory;

import com.xuliwen.dm.abstractfactory.iml.FactoryIml;
import com.xuliwen.dm.abstractfactory.iml.Shape;
import com.xuliwen.dm.abstractfactory.shape.red.RedLine;
import com.xuliwen.dm.abstractfactory.shape.red.RedPath;

/**
 * Created by xlw on 2017/5/1.
 */

public class RedFactory implements FactoryIml {
    @Override
    public Shape createLine() {
        return new RedLine();
    }

    @Override
    public Shape createPath() {
        return new RedPath();
    }
}
