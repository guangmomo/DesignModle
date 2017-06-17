package com.xuliwen.dm.proguardtest.libtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.adxmi.android.AdxmiNativeAd;
import com.xuliwen.dm.R;
import com.xuliwen.dm.proguardtest.Test;

public class LibTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib_test);
        AdxmiNativeAd adxmiNativeAd=new AdxmiNativeAd(this,"jj");
        Test test=new Test();
        test.test();
    }
}
