package dev.me.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;



public class Salamander{
        String name;
        int age;
        float a;
        Color color;
        List<List<String>> environments;
        BigDecimal bd;
        UUID uuid;
        Map<String, Map<String, String>>  doubleMap;
        boolean isOkay;


        public Salamander(String name, int age, Color color, List<List<String>> environments, BigDecimal bd, Map<String, Map<String, String>> doubleMap, float weight, UUID uuid, boolean isFree) {
                this.name = name;
                this.age = age;
                this.color = color;
                this.environments = environments;
                this.bd = bd;
                this.doubleMap = doubleMap;
                this.a = weight;
                this.uuid = uuid;
                this.isOkay = isFree;
        }

        public String name() {
                return name;
        }

        public int age() {
                return age;
        }

        public Color color() {
                return color;
        }

        public List<List<String>> environments() {
                return environments;
        }

        public BigDecimal bd() {
                return bd;
        }

        public Map<String, Map<String, String>> doubleMap() {
                return doubleMap;
        }
}



