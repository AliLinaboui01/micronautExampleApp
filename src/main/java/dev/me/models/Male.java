package dev.me.models;

import java.util.List;
import java.util.Map;

public class Male {

    private String name;
    private int lag;
    private List<String> colors;
    private Map<String, String> map;

    public Male() {
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public Male(String name, int age, List<String> colors, Map<String, String> map) {
        this.name = name;
        this.lag = age;
        this.colors = colors;
        this.map = map;
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

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
