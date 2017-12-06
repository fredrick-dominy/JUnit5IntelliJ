package com.javatests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest
{
	@Test
	public void testCase1() {
		assertEquals(5, Vowels.getCount("abracadabra"));
	}
	@Test
	public void testCase2() {
		assertEquals(8, Vowels.getCount("jfdkslajkajki jk i jfdkofjdkofjdsk u fjsdku"));
	}
}