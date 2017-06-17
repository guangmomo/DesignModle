package com.xuliwen.dm.iterator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.xuliwen.dm.Constants;
import com.xuliwen.dm.R;

public class IteratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator);
        iterator();
    }

    private void iterator(){
        Aggregation<String> a = new ConcreteAggregation<>();
        a.add("a");
        a.add("b");
        a.add("c");
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()) {
            Log.e(Constants.TAG,"迭代器模式："+iterator.next());
        }
    }
}
