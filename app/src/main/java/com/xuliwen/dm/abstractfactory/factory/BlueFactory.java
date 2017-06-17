package com.xuliwen.dm.abstractfactory.factory;

import com.xuliwen.dm.abstractfactory.iml.FactoryIml;
import com.xuliwen.dm.abstractfactory.iml.Shape;
import com.xuliwen.dm.abstractfactory.shape.blue.BlueLine;
import com.xuliwen.dm.abstractfactory.shape.blue.BluePath;

/**
 * Created by xlw on 2017/5/1.
 * 1. 抽象工厂对比工厂方法
 * 1）工厂类用于生产一类产品，比如BlueFactory用于生产蓝色的形状，工厂类的一个方法用于生产一个具体的产品
 *
 * 2. 优点：减少了工厂类的个数，当增加一个类别的时候（比如增加黑色的形状，只需增加一个工厂类即可），符合开闭原则
 *    缺点：当一个类型要增加一个产品的时候，违反开闭原则（即需要在FactoryIml中增加一个方法，然后每个具体工厂类也需要修改）
 *
 * 3. 适用场景： 产品很多，无法为每个产品都创建一个工厂类，产品确定之后，不会再增加新的产品（觉得这点几乎无法做到，所以
 *               抽象工厂的应用场景很小）
 *
 * 4. 写法：
 * 1）对产品进行分类，每一个分类对应一个具体工厂，一个具体工厂提供不同的方法创建不同的产品
 * 2）具体工厂实现抽象工厂
 *
 * 5. java中的应用场景：
 *  JDBC
 *
 *
 *
 */

public class BlueFactory implements FactoryIml {
    @Override
    public Shape createLine() {
        return new BlueLine();
    }

    @Override
    public Shape createPath() {
        return new BluePath();
    }
}
