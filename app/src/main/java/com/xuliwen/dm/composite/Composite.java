package com.xuliwen.dm.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xlw on 2017/5/10.
 *  树干  Composite类继承于Component
 */

class Composite extends Component {
    private String nodeName;
    private List<Component> childList;	//保存孩子节点

    public Composite(String nodeName) {
        this.nodeName = nodeName;
        childList = new ArrayList<Component>();
    }

    @Override
    public int getChildNum() {

        return childList.size();
    }

    @Override
    public String getName() {

        return this.nodeName;
    }

    @Override
    public String getType() {

        return "Composite";
    }

    @Override
    public void add(Component c) {
        childList.add(c);
    }

    @Override
    public void remove(Component c) {
        childList.remove(c);
    }
}