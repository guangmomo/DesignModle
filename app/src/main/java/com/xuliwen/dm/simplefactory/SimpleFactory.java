package com.xuliwen.dm.simplefactory;



/**
 * Created by xlw on 2017/4/30.
 * 简单工厂
 * 1. 优点：将对象的创建和使用分开
 * 1） 如果构造函数需要修改，就只需要在工厂类里作修改;如果没有使用工厂类，就需要在很多的地方修改构造函数
 * 2） 对于一些复杂的类名，通过简单工厂模式可以在一定程度减少使用者的记忆量
 * 3） 如果对象构造的时候不止要new，还要初始化很多参数，没有工厂方法的话，就需要些很多次这样的初始化代码（虽然可以放在构造方法中，但这样构造函数的逻辑过于复杂）
 * 4） 当一个类由很多构造函数的时候，调用者会不明白这些构造函数有什么用，可以用一些简单明了的方法来命名工厂方法，方便调用者理解
 *
 * 2. 缺点：
 * 1） 使用if,else来判断要创建哪个对象，那当增加一个形状的时候，就要增加一个else，违反开闭原则
 * 2） 将所有对象的判断和创建都写在getShape()，使getShape()过于复杂
 *
 * 3. 适用场景：
 * 1）构造函数太复杂难记，用工厂方法起个容易记的名字
 * 2）构造一个对象需要很多初始化操作，这些操作又不能放在构造函数中，所以可以把这些操作放在工厂方法中
 *    这样就不需要每创建一个对象都写一遍初始化化代码了
 *
 * 4. 写法：在简单工厂中通过对参数的比较来决定创建哪一个产品
 *
 */

public class SimpleFactory {
    public static BaseShape getShape(String shape){
        BaseShape baseShape=null;
        if(shape.equals("circle")){
            baseShape=new Circle();
        }else if(shape.equals("line")){
            baseShape=new Line();
        }else if(shape.equals("path")){
            baseShape=new Path();
        }
        return baseShape;
    }
}
