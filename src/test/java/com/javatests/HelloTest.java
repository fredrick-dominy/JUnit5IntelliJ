package com.javatests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest
{
	@Test
	public void test1() throws Exception {
		Hello h = new Hello();
		String[] name = {"John", "Smith"};
		assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
			h.sayHello(name, "Phoenix", "Arizona"));
	}

	@Test
	public void test2() throws Exception {
		Hello h = new Hello();
		String[] name = {"John","Wilkes","Booth"};
		assertEquals("Hello, John Wilkes Booth! Welcome to Macon, Georgia!",
			h.sayHello(name, "Macon", "Georgia"));
	}
}