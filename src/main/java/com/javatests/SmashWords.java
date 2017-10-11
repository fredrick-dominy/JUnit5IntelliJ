package com.javatests;

public class SmashWords {
    public static String smash(String... words) {
        if(words.length > 0){
            return String.join(" ", words);
        }
        return "";
    }
}