package com.javatests;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PartlistTest
{
	private static void testing(String actual, String expected)
	{
		assertEquals(expected, actual);
	}

	@Test
	public void test3() {
		String[] s1 = new String[] {"ab","cd"};
		String a = "[[ab, cd]]";
		testing(Arrays.deepToString(Partlist.partlist(s1)), a);
	}

	@Test
	public void test4() {
		String[] s1 = new String[] {"a","b","c","d"};
		String a = "[[a, b c d], [a b, c d], [a b c, d]]";
		testing(Arrays.deepToString(Partlist.partlist(s1)), a);
	}


	@Test
	public void test()
	{
		System.out.println("Fixed Tests partlist");
		String[] s1 = new String[]{"cdIw", "tzIy", "xDu", "rThG"};
		String a = "[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]]";
		testing(Arrays.deepToString(Partlist.partlist(s1)), a);
	}
	@Test
	public void test1(){
		String[] s1 = new String[]{"I", "wish", "I", "hadn't", "come"};
		String a = "[[I, wish I hadn't come], [I wish, I hadn't come], [I wish I, hadn't come], [I wish I hadn't, come]]";
		testing(Arrays.deepToString(Partlist.partlist(s1)), a);
	}
	@Test
	public void test2() {
		String[] s1 = new String[]{"vJQ", "anj", "mQDq", "sOZ"};
		String a = "[[vJQ, anj mQDq sOZ], [vJQ anj, mQDq sOZ], [vJQ anj mQDq, sOZ]]";
		testing(Arrays.deepToString(Partlist.partlist(s1)), a);
	}
}