package com.xuliwen.dm.observer;

/**
 * Created by xlw on 2017/4/30.
 * 要通知观察者的数据对象，可能有多种，所以要求观察者和被观察者都使用泛型
 */

public class Weather {
    private String description;

    public Weather(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "description='" + description + '\'' +
                '}';
    }

}
