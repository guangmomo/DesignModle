http://www.cnblogs.com/houleixx/archive/2008/02/23/1078877.html
http://www.cnblogs.com/Jessy/p/3653008.html

1. 桥接模式的应用场景：
若一个系统可以具有n个经常变化的维度，可以将这些维度分开成n个抽象类，其中一个抽象类用组合的方式
持有其他抽象类。


2. 具体场景：
比如坦克有两个变化的维度，型号和平台，型号类持有平台类，当增加一个型号时，
只需新建一个类继承于Tank，当增加一个平台时，只需新建一个类继承于Tank，这样符合
开闭原则，单一职责原则。

如果使用继承的方式来实现，首先平台类继承于Tank，然后型号类又继承于平台类。
缺点如下：
1）这样会使得类的数量剧增。当增加一个平台类的时候，对应的型号类也要增加，
2）当增加一个平台类的时候，就需要增加对应的所有型号类，破坏了类的单一职责原则，因为增加平台类，
增加型号类都会使型号类增加，即引起型号类变化的因素有两个：平台的变化，型号的变化

3. 优点：
1）解耦多个维度，符合开闭原则，单一职责原则（使得多个维度可以独立的变化）


4. 和适配器模式的区别
1）桥模式并不同于适配器模式，适配器模式其实是一个事后诸葛亮，当发现以前的东西不适用了才去做一个
弥补的措施。桥模式相对来说所做的改变比适配器模式早，它可以适用于有两个甚至两个以上维度的变化。
2） 如果你拿到两个已有模块，想让他们同时工作，那么你使用的适配器。
    如果你还什么都没有，但是想分开实现，那么桥接是一个选择。

共同点：
都是使用组合的方式来重构代码

4. 组合优于多继承
1）多继承破坏了单一职责原则
2）多继承类的结构复杂
3）多继承在扩展的时候会使类的数量变得庞大，所以扩展性差
