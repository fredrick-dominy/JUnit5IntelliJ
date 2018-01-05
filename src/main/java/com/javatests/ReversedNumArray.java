package com.javatests;

public class ReversedNumArray {
	public static int[] digitize(long i) {

        long revLong = i;
        String revLongString = Long.toString(revLong);
        String[] revLongStringArray = revLongString.split("");

        int[] intArray = new int[revLongStringArray.length];

        for (int j = 0; j < revLongStringArray.length; j++) {
            intArray[j] = Integer.parseInt(revLongStringArray[revLongStringArray.length - j - 1]);
        }

        return intArray;

	}
}
