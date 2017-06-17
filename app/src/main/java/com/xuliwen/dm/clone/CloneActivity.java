package com.xuliwen.dm.clone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.xuliwen.dm.Constants;
import com.xuliwen.dm.R;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CloneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clone);
        //  cloneBySerialize();
       // cloneByClone();
      //  timeTestByClone();
          timeTestBySerialize();

    }

    private void cloneByClone() {
        Person p1 = new Person();
        p1.setAge(12);
        p1.setId(1);
        p1.setName("xuliwen");
        p1.setSchool("广工");
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("篮球");
        hobbies.add("羽毛球");
        p1.setHobbies(hobbies);
        ArrayList<StringBuilder> testBuilder = new ArrayList<>();
        testBuilder.add(new StringBuilder("篮球"));
        testBuilder.add(new StringBuilder("羽毛球"));
        p1.setTestBulder(testBuilder);
        Log.e(Constants.TAG, p1.toString());

        Person p2 = (Person) p1.clone();
        p2.setName("qiudonglian");
        p2.getHobbies().add("足球");
        p2.getTestBulder().get(1).append("改变");
        Log.e(Constants.TAG, p2.toString());

        Log.e(Constants.TAG, p1.toString());
    }

    private void cloneBySerialize() {
        Person p1 = new Person();
        p1.setAge(12);
        p1.setId(1);
        p1.setName("xuliwen");
        p1.setSchool("广工");
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("篮球");
        hobbies.add("羽毛球");
        p1.setHobbies(hobbies);
        ArrayList<StringBuilder> testBuilder = new ArrayList<>();
        testBuilder.add(new StringBuilder("篮球"));
        testBuilder.add(new StringBuilder("羽毛球"));
        p1.setTestBulder(testBuilder);
        Log.e(Constants.TAG, p1.toString());

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(p1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] bytes = byteArrayOutputStream.toByteArray();
        try {
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Person p2 = null;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            p2 = (Person) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        p2.setName("qiudonglian");
        p2.getHobbies().add("足球");
        p2.getTestBulder().get(1).append("改变");
        Log.e(Constants.TAG, p2.toString());

        Log.e(Constants.TAG, p1.toString());
    }


    private void timeTestBySerialize() {
        Person p1 = new Person();
        long beginTime = System.currentTimeMillis();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(p1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] bytes = byteArrayOutputStream.toByteArray();
        try {
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Person[] array = new Person[1000];
        for (Person p3 : array) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream = null;
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                p3 = (Person) objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        long endTime = System.currentTimeMillis();
        Log.e(Constants.TAG, "Time Serialize：" + (endTime - beginTime));
    }


    private void timeTestByClone() {
        Person p1 = new Person();
        Log.e(Constants.TAG, p1.toString());

        long beginTime = System.currentTimeMillis();
        Person[] array = new Person[1000];
        for (Person p3 : array) {
            p3 = (Person) p1.clone();
        }
        long endTime = System.currentTimeMillis();
        Log.e(Constants.TAG, "Time byClone：" + (endTime - beginTime));
    }
}
