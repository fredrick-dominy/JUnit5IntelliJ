package com.javatests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PythagoreanTriple {
	public int pythagoreanTriple(int[] triple){
		int c;
		int bPlusA;

		List<Integer> iL = new ArrayList<Integer>();

		for (int pythInt : triple) {
			iL.add(pythInt);
		}

		Collections.sort(iL);

		c =  (int)(Math.pow(iL.get(2), 2));
		bPlusA = (int)((Math.pow(iL.get(1),2))+(Math.pow(iL.get(0), 2)));

		return c == bPlusA ?  1 : 0;
	}
}
