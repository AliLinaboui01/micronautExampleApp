package dev.me.models;

import java.util.List;
import java.util.Map;

public class Male {

    private String name;
    private int lag;


    public Male() {
    }



    public Male(String name, int age) {
        this.name = name;
        this.lag = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return lag;
    }

    public void setAge(int age) {
        this.lag = age;
    }

}
