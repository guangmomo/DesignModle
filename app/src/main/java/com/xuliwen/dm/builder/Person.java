package com.xuliwen.dm.builder;

/**
 * Created by xlw on 2017/4/30.
 * 1. Builder模式应用场景：
 * AlertBuilder，Okhttp
 *
 * 2. 优点：
 * 如 Person，有很多属性需要设置，对使用这个类的程序员来说，并不是每一个属性都需要设置的，那么Person类需要对
 * 外提供1,2,3,4,5个参数的构造方法，这样过于繁琐，用builder模式就是解决此问题
 *
 * 3. 写法：
 * 写一个static的内部类Builder，Builder提供和Person相同的属性，暴露这些属性的set方法（注意set方法返回Builder，
 * 方便连缀式写法），暴露build方法创建Person对象，Person声明一个Person(Builder builder)的构造方法供Builder调用
 *
 * 4. 适用场景：
 * 1）构造方法的参数很多
 *
 *
 */

public class Person {
    private int age;
    private String school;
    private String name;
    private String father;
    private String mother;

    private Person(Builder builder){//通过Builder来创建Person
        this.age=builder.age;
        this.name=builder.name;
        this.school=builder.school;
        this.father=builder.father;
        this.mother=builder.mother;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
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

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", school='" + school + '\'' +
                ", name='" + name + '\'' +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                '}';
    }

    static class Builder{//static 内部类，用此类构造Person
        private int age;
        private String school;
        private String name;
        private String father;
        private String mother;

        public Builder setAge(int age) {//返回Builder，这样可以使用连缀式写代码
            this.age = age;
            return this;
        }

        public Builder setFather(String father) {
            this.father = father;
            return this;
        }

        public Builder setMother(String mother) {
            this.mother = mother;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Person build(){//build 创建Person对象
           return new Person(this);
        }
    }
}
