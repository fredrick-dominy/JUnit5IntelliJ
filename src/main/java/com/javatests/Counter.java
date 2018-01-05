package com.javatests;

public class Counter {
    public int countSheeps(boolean[] array1) {

        int counter = 0;

        for(boolean sheep : array1) {
            if(sheep){
                counter += 1;
            }
        }

        return counter;
    }
}
