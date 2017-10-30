package com.javatests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PythagoreanTripleTests {
	static int[] p1={3,4,5};
	static int[] p2={3,5,7};
	static int[] p3={3,1,2};
	PythagoreanTriple pT = new PythagoreanTriple();

	@Test
	public void validTriple() {
		assertEquals(1, pT.pythagoreanTriple(p1));
	}

	@Test
	public void invalidTriple() {
		assertEquals(0, pT.pythagoreanTriple(p2));
	}

	@Test
	public void unsorted() {
		assertEquals(0, pT.pythagoreanTriple(p3));
	}
}
