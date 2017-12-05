package com.javatests;


import java.util.Arrays;

/*
	Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
	Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
	Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
*/
public class Accumul
{
	public static String accum(String s)
	{
		String[] sArray = s.split("");
		splitStringByChar(sArray);
		return String.join("-", sArray);
	}

	private static void splitStringByChar(String[] sArray)
	{
		int sArrayLength = sArray.length;

		for(int i = 0; i < sArrayLength; i++) {
			sArray[i] = sArray[i].toUpperCase() + repeatChar(sArray[i].toLowerCase(), i);
		}
	}

	private static String repeatChar(String s, int n)
	{
		String tempStr = "";
		int step = 0;
		while ( step < n) {
			tempStr = tempStr + s;
			step++;
		}

		return tempStr;
	}
}
