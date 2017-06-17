package com.xuliwen.dm.composite;

/**
 * Created by xlw on 2017/5/10.
 * 树叶 继承Component接口
 */

class Leaf extends Component {
    private String nodeName;

    public Leaf(String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public int getChildNum() {

        return 0;
    }

    @Override
    public String getName() {

        return this.nodeName;
    }

    @Override
    public String getType() {

        return "Leaf";
    }

    @Override
    public void add(Component c) {
        System.err.println("ERROR ! Leaf Not supported add method!");
    }

    @Override
    public void remove(Component c) {
        System.err.println("ERROR ! Leaf Not supported remove method!");
    }
}
