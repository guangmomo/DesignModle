package com.xuliwen.dm.builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.xuliwen.dm.Constants;
import com.xuliwen.dm.R;

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        builder();
    }

    private void builder(){
        Person person=new Person.Builder().setAge(12).setFather("徐建祥").setMother("吴苑金")
                .setName("徐立文").setSchool("广东工业大学").build();
        Log.e(Constants.TAG,person.toString());
    }
}
