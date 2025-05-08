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
        List<Male1> male;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public float getA() {
                return a;
        }

        public void setA(float a) {
                this.a = a;
        }

        public Color getColor() {
                return color;
        }

        public void setColor(Color color) {
                this.color = color;
        }

        public List<List<String>> getEnvironments() {
                return environments;
        }

        public void setEnvironments(List<List<String>> environments) {
                this.environments = environments;
        }

        public BigDecimal getBd() {
                return bd;
        }

        public void setBd(BigDecimal bd) {
                this.bd = bd;
        }

        public UUID getUuid() {
                return uuid;
        }

        public void setUuid(UUID uuid) {
                this.uuid = uuid;
        }

        public Map<String, Map<String, String>> getDoubleMap() {
                return doubleMap;
        }

        public void setDoubleMap(Map<String, Map<String, String>> doubleMap) {
                this.doubleMap = doubleMap;
        }

        public boolean isOkay() {
                return isOkay;
        }

        public void setOkay(boolean okay) {
                isOkay = okay;
        }

        public BigInteger getBigInt() {
                return bigInt;
        }

        public void setBigInt(BigInteger bigInt) {
                this.bigInt = bigInt;
        }

        public Date getDate() {
                return date;
        }

        public void setDate(Date date) {
                this.date = date;
        }

        public Timestamp getTimestamp() {
                return timestamp;
        }

        public void setTimestamp(Timestamp timestamp) {
                this.timestamp = timestamp;
        }

        public Salamander getSalamander() {
                return salamander;
        }

        public void setSalamander(Salamander salamander) {
                this.salamander = salamander;
        }

        public OffsetTime getOffsetTime() {
                return offsetTime;
        }

        public void setOffsetTime(OffsetTime offsetTime) {
                this.offsetTime = offsetTime;
        }

        public Duration getDuration() {
                return duration;
        }

        public void setDuration(Duration duration) {
                this.duration = duration;
        }

        public Character getCharacter() {
                return character;
        }

        public void setCharacter(Character character) {
                this.character = character;
        }

        public char getaChar() {
                return aChar;
        }

        public void setaChar(char aChar) {
                this.aChar = aChar;
        }

        public Set<String> getStringSet() {
                return stringSet;
        }

        public void setStringSet(Set<String> stringSet) {
                this.stringSet = stringSet;
        }

        public byte getZyt() {
                return zyt;
        }

        public void setZyt(byte zyt) {
                this.zyt = zyt;
        }

        public short getaShort() {
                return aShort;
        }

        public void setaShort(short aShort) {
                this.aShort = aShort;
        }

        public List<Male1> getMale() {
                return male;
        }

        public void setMale(List<Male1> male) {
                this.male = male;
        }

        public Arrays getArrays() {
                return arrays;
        }

        public void setArrays(Arrays arrays) {
                this.arrays = arrays;
        }

        public Vector<String> getVector() {
                return vector;
        }

        public void setVector(Vector<String> vector) {
                this.vector = vector;
        }

        Arrays arrays;
        Vector<String> vector;

//        public Salamander(String name, int age, Color color, List<List<String>> environments, BigDecimal bd, Map<String, Map<String, String>> doubleMap, float weight, UUID uuid, boolean isFree, BigInteger bigInt, char aChar) {
//                this.name = name;
//                this.age = age;
//                this.color = color;
//                this.environments = environments;
//                this.bd = bd;
//                this.doubleMap = doubleMap;
//                this.a = weight;
//                this.uuid = uuid;
//                this.isOkay = isFree;
//                this.bigInt = bigInt;
//                this.aChar = aChar;
//        }

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



