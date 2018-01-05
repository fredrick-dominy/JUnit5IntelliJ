package com.javatests;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DivisibleByTests {
	@Test
	public void testOne()
	{
 	    assertTrue(Arrays.equals(new int[] {2,4,6}, DivisibleBy.divisibleBy(new int[] {1,2,3,4,5,6},2)));
	}

	@Test void testTwo()
	{
		assertTrue(Arrays.equals(new int[] {3,6}, DivisibleBy.divisibleBy(new int[] {1,2,3,4,5,6},3)));
	}

	@Test void testThree()
	{
		assertTrue(Arrays.equals(new int[] {0,4}, DivisibleBy.divisibleBy(new int[] {0,1,2,3,4,5,6},4)));
	}
}
