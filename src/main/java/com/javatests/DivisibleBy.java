package com.javatests;


import java.util.ArrayList;
import java.util.List;

/*
* Write a function which takes two arguments and returns all
* numbers which are divisible by given divisor.
* First argument is array of numbers and the second
* is divisor.
*
* */
public class DivisibleBy {

	public static int[] divisibleBy(int[] ints, int i)
	{
		List<Integer> matchStorage = new ArrayList<>();
	
		for(int num : ints)
		{
			if ((num % i) == 0) {
				matchStorage.add(num);
			}
		}

		int[] dividable = new int[matchStorage.size()];

		for(int k = 0; k < matchStorage.size(); k++)
		{
			dividable[k] = matchStorage.get(k);
		}

		return dividable;
	}
}
