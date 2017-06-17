package com.xuliwen.dm.composite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.xuliwen.dm.Constants;
import com.xuliwen.dm.R;

public class CompositeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composite);
        composite();
    }

    private void composite(){
        Component root = new Composite("root");	//根节点

        Component composite = new Composite("composite");	//树枝节点

        //叶节点
        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");

        composite.add(leaf2);
        root.add(leaf1);
        root.add(composite);

        String str = "Leaf1's size is " + leaf1.getChildNum();
        str += "\nleaf2's size is " + leaf2.getChildNum();
        str += "\nComposite's size is " + composite.getChildNum();
        str += "\nRoot's size is " + root.getChildNum();

        Log.e(Constants.TAG,"组合模式："+str);
    }
}
