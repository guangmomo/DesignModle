package com.xuliwen.dm.adapter.objectadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.xuliwen.dm.Constants;
import com.xuliwen.dm.R;

public class ObjectAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_adapter);
        objectAdapter();
        classAdapter();
        interfaceAdapter();
    }

    private void objectAdapter(){
        ObjectAdapter objectAdapter=new ObjectAdapter();
        Log.e(Constants.TAG,"对象适配器： "+objectAdapter.translateEnglish("我爱你"));
        Log.e(Constants.TAG,"对象适配器： "+objectAdapter.translateJapanese("我爱你"));

    }


    private void classAdapter(){
        ClassAdapter classAdapter=new ClassAdapter();
        Log.e(Constants.TAG,"类适配器：  "+classAdapter.translateEnglish("我爱你"));
        Log.e(Constants.TAG,"类适配器：  "+classAdapter.translateJapanese("我爱你"));
    }

    private void interfaceAdapter(){
        InterfaceAdapter1 interfaceAdapter1=new InterfaceAdapter1();
        Log.e(Constants.TAG,"接口适配器1：  "+interfaceAdapter1.translateEnglish("我爱你"));
        Log.e(Constants.TAG,"接口适配器1：  "+interfaceAdapter1.translateJapanese("我爱你"));
        InterfaceAdapter2 interfaceAdapter2=new InterfaceAdapter2();
        Log.e(Constants.TAG,"接口适配器2：  "+interfaceAdapter2.translateJapanese("我爱你"));
        Log.e(Constants.TAG,"接口适配器2：  "+interfaceAdapter2.translateEnglish("我爱你"));
    }
}
