package com.javatests;

/*
*
* Write a function partlist that gives all the ways to divide a
* list (an array) of at least two elements into two non-empty parts.
*
* Each part will be in a string
* Elements of a pair must be in the same order as in the original array.
*
* Example:
* a = ["az", "toto", "picaro", "zone", "kiwi"] -->
* [["az", "toto picaro zone kiwi"], ["az toto", "picaro zone kiwi"], ["az toto picaro", "zone kiwi"], ["az toto picaro zone", "kiwi"]]
*
* */
public class Partlist
{


	public static String[][] partlist(String[] arr)
	{

		int itemsInArr = arr.length;

		String[][] arrayContainer = new String[itemsInArr - 1][];

		for(int i = 0; i < itemsInArr - 1; i++) {
			arrayContainer[i] = addArraysToContainer(arr, i, itemsInArr);
		}

		return arrayContainer;
	}

	private static String[] addArraysToContainer(String[] arr, int splitPoint, int length)
	{
		String[] splitArray = new String[2];

		for(int j = 0; j < length; j++) {
			if(j <= splitPoint) {
				splitArray[0] = splitArray[0] == null ? arr[j] : (splitArray[0] + " " + arr[j]);
			} else {
				splitArray[1] = splitArray[1] == null ? arr[j] : splitArray[1] + " " + arr[j];
			}
		}

		return splitArray;
	}
}
