package com.xuliwen.dm.strategy;

/**
 * Created by xlw on 2017/4/30.
 * 策略模式
 * 1. 优点：对扩展开放（扩展性），对修改关闭（稳定性），即开闭原则
 * 使用策略模式：   增加一种形状的时候，只需要新建一个类实现BaseShape接口即可
 * 不使用策略模式： 需要增加大量的if，else判断当前的模式是什么，而且当需要增加一种形状的时候，就需要修改ShapeModle中的代码
 *                  （即增加一个else判断）
 *
 * 2. 应用场景：
 *   插值器，估值器
 *
 * 3. 写法：
 *  1）创建一个策略接口，接口中定义一些方法给策略类去实现
 *  2）创建策略类，实现策略接口的方法，在方法里面写具体策略
 *  3）创建一个model类去调用策略类
 *
 * 4. 适用场景：
 *   解决一个问题有多种策略的时候，用if，else判断违反开闭原则，用策略模式就可以遵守开闭原则了
 */

public class ShapeModel {

    private BaseShape baseShape;
    
    public BaseShape getBaseShape() {
        return baseShape;
    }

    public void setBaseShape(BaseShape baseShape) {//设置当前策略
        this.baseShape = baseShape;
    }

    public void shape(){//调用策略
        baseShape.shape();
    }
}
