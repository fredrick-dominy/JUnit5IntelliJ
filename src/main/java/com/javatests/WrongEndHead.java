package com.javatests;




public class WrongEndHead {
    public static Object[] fixTheMeerkat(String[] strings) {
        String[] tempArr = new String[strings.length];
        for (int i = 0; i < strings.length; i ++) {
            tempArr[strings.length-1-i] = strings[i];
        }
        return tempArr;
    }
}
