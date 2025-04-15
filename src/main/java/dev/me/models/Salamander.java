package dev.me.models;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.util.*;


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
        BigInteger bigInt;
        Date date;
        Timestamp timestamp;
        Salamander salamander;
        OffsetTime offsetTime;
        Duration duration;
        Character character;
        char aChar;
        Set<String> stringSet;
        byte zyt;
        short aShort;
        Male1 male;
        Arrays arrays;
        Vector<String> vector;

        public Salamander(String name, int age, Color color, List<List<String>> environments, BigDecimal bd, Map<String, Map<String, String>> doubleMap, float weight, UUID uuid, boolean isFree, BigInteger bigInt) {
                this.name = name;
                this.age = age;
                this.color = color;
                this.environments = environments;
                this.bd = bd;
                this.doubleMap = doubleMap;
                this.a = weight;
                this.uuid = uuid;
                this.isOkay = isFree;
                this.bigInt = bigInt;

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
class Male1 {
        int age;
        String name;


        public int getAge() {
                return age;
        }
        public String getName() {
                return name;
        }
}



