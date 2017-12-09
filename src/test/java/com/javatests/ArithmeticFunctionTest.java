package com.javatests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticFunctionTest
{
	@Test
	public void testBasic() {
		assertEquals( 3, ArithmeticFunction.arithmetic(1, 2, "add"));
	}
	@Test
	public void testSub() {
		assertEquals( 6, ArithmeticFunction.arithmetic(8,2, "subtract"));
	}
	@Test
	public void testMult() {
		assertEquals( 10, ArithmeticFunction.arithmetic(5, 2, "multiply"));
	}
	@Test
	public void testDiv() {
		assertEquals( 4, ArithmeticFunction.arithmetic(8, 2, "divide"));
	}
}