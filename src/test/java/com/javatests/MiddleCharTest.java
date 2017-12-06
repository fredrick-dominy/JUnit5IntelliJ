package com.javatests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleCharTest
{
	@Test
	public void evenTest1() {
		assertEquals("es", MiddleChar.getMiddle("test"));
	}
	@Test
	public void evenTest2(){
		assertEquals("dd", MiddleChar.getMiddle("middle"));
	}
	@Test
	public void evenTest3(){
		assertEquals("nu", MiddleChar.getMiddle("alphanumeric"));
	}

	@Test
	public void oddTest1() {
		assertEquals("t", MiddleChar.getMiddle("testing"));
	}
	@Test
	public void oddTest2(){
		assertEquals("A", MiddleChar.getMiddle("A"));
	}
	@Test
	public void oddTest3(){
		assertEquals("o", MiddleChar.getMiddle("Californian"));
	}
}