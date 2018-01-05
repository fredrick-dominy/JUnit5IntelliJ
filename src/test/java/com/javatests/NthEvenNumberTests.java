package com.javatests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class NthEvenNumberTests {
	@Test
	public void zeroTest() {
		assertEquals(0, NthEvenNumber.nthEven(1));
	}

	@Test
	public void oneTest() {assertEquals(2, NthEvenNumber.nthEven(2));}

	@Test
	public void twoTest() {assertEquals(4, NthEvenNumber.nthEven(3));}

	@Test
	public void hundredTest() {assertEquals(198, NthEvenNumber.nthEven(100));}
}
