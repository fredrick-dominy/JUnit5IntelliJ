package com.javatests;

public class MiddleChar
{

	public static String getMiddle(String word)
	{
		String[] intArray = word.split("");
		int length = intArray.length;
		if(length > 0) {
			if(length % 2 == 0) {
				return intArray[length/2 - 1] + intArray[length/2];
			} else {
				return intArray[(int) Math.ceil(length/2)];
			}
		}
		return "";
	}
}
