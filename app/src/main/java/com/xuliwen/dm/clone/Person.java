package com.xuliwen.dm.clone;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by xlw on 2017/4/30.
 * 概念：
 * 浅拷贝：对基本类型的变量将其值复制过来，对引用类型的变量只复制其引用
 * 深拷贝：对基本类型的变量将其值复制过来，对引用类型的变量复制其引用和引用关联所有的对象（即对象如果又引用其他对象，那么也要将其引用对象复制过来）
 *
 * 1. 写法 ： 1）实现Cloneable接口，在clone方法里面，特别注意深拷贝的处理     2）将对象序列化
 * http://www.cnblogs.com/shuaiwhu/archive/2010/12/14/2065088.html
 * http://www.cnblogs.com/Jtianlin/p/4605477.html
 *
 * 两种写法的适用常景：
 * 写法1）：适合深拷贝的处理比较简单                                 特点：速度快，代码比较复杂,占用内存少；适合克隆大量的对象
 * 写法2）：当写法1）的深拷贝处理比较复杂的时候（会使得代码复杂）    特点：速度慢，代码简单，占用内存大；因为ObjectInputStream不能重用，如果需要clone出10000个对象，那么就要创建1000个ObjectInputStream，造成内存占用大，速度慢,所以不适合克隆大量的对象
 *
 * <p>
 * 2. 实现Cloneable方法的写法有两种   1）调用super.clone()（浅拷贝），参照Person类       2）在clone()里面调用构造函数，参照intent类，安卓源码大量使用这种方法
 *
 *
 * 3. 对一些关键点作详解：
 * 1）super.clone() 浅拷贝，如果类中包含引用类型的成员变量，只会拷贝变量的引用
 * 2）ArrayList.clone() 浅拷贝，只拷贝了List的元素的引用，没有拷贝元素的内容
 * 3）序列化会生成一个全新的对象，跟原对象不会产生任何关联
 * 4）clone()和反序列化都不会调用构造方法
 *
 *
 * 4. 原型模式在Android中的应用
 * 1）Intent，okhttp，bundle
 *
 * 5. 适用场景：
 * 1）需要一个对象的副本，通过重新构造对象会比较复杂，就可以使用原型模式了
 */

public class Person implements Cloneable ,Serializable{
    private int age;
    private String name;
    private String school;
    private int id;
    private ArrayList<String> hobbies;
    private ArrayList<StringBuilder> testBulder;

    public ArrayList<StringBuilder> getTestBulder() {
        return testBulder;
    }

    public void setTestBulder(ArrayList<StringBuilder> testBulder) {
        this.testBulder = testBulder;
    }



    public Person() {

    }

    private Person(Person person) {
        this.age = person.getAge();
        this.school = person.getSchool();
        this.id = person.getId();
        this.name = person.getName();
        if (person.hobbies != null) {
            /**
             * 以下都是浅拷贝，因为String类型不可变，所以看似实现了深拷贝
             */
//            this.hobbies = new ArrayList<>();
//1.            this.hobbies.addAll(person.getHobbies());
//2.            this.hobbies = new ArrayList<>(person.getHobbies());
             this.hobbies = (ArrayList<String>) person.getHobbies().clone();
        }
        if (person.testBulder != null) {
            /**
             * 以下都是浅拷贝
             */
//            this.testBulder=new ArrayList<>();
//1.            testBulder.addAll(person.getTestBulder());
//2.           this.testBulder=new ArrayList<>(person.getTestBulder())
//3.            this.testBulder= (ArrayList<StringBuilder>) person.getTestBulder().clone();

            /**
             * 深拷贝处理
             */
            this.testBulder = new ArrayList<>();
            for (StringBuilder builder : person.testBulder) {
                StringBuilder temp = new StringBuilder(builder.toString());
                this.testBulder.add(temp);
            }
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    protected Object clone() { //通过构造函数实现clone
        return new Person(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", id=" + id +
                ", hobbies=" + hobbies +
                ", testBulder=" + testBulder +
                '}';
    }

    /*  @Override
    protected Object clone() {//浅拷贝：虽然对ArrayList进行了处理
        Person person = null;
        try {
            person = (Person) super.clone();//1. 先进行浅拷贝，拷贝的是引用
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        person.hobbies = (ArrayList<String>) this.hobbies.clone(); //2. 对需要深拷贝的成员变量进行深拷贝，拷贝的是元素的内容
        return person;

    }*/

  /*  @Override
    protected Object clone() { //浅拷贝：直接调用super.clone()，就可以实现浅拷贝
        Object object=null;
        try {
            object=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }*/


}
