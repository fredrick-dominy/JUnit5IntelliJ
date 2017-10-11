package com.javatests;

public class CalcAverage {
    public static double find_average(int[] array) {
        if(array.length > 0) {
            double sub = 0;
            for (int i : array) {
                sub = sub + i;
            }
            return sub/array.length;
        } else {
            return 0;
        }
        //cool solution I found on the site.
        //return Arrays.stream(array).average().orElse(0);
    }
}
