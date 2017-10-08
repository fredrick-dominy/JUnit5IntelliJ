package com.example;

/*
* Clock shows 'h' hours, 'm' minutes and 's'
* seconds after midnight.
*
* Your task is to make 'Past' function which
* returns time converted to miliseconds.
*
* #####Example:
* Past(0, 1, 1) == 61000
*
* */

public class Clock {
    public static int Past(int h,int m,int s) {
        int millS = 1000 * s;
        int millM = m * 60000;
        int millH = 3600000 * h;
        return millS + millM + millH;
    }
}
