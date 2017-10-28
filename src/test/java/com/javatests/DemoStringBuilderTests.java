package com.javatests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

//import static com.javatests.DemoStringBuilder.listToStrings;

public class DemoStringBuilderTests {
	@Test
	public void treeTest() throws Exception {
		String respString = "oak * pine * ebony";
		List<String> trees = Arrays.asList("oak","pine","ebony");
		assertEquals(DemoStringBuilder.listToStrings(trees), respString);
	}

	@Test
	public void famTest() throws Exception {
		String respString = "daughter * father * mother * son";
		List<String> fam = Arrays.asList("daughter","father","mother","son");
		assertEquals(DemoStringBuilder.listToStrings(fam), respString);
	}
}
