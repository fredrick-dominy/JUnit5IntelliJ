package com.javatests;

import java.util.Arrays;
import java.util.List;

public class DemoStringBuilder {
	public static String listToStrings(List<String> list) {
		StringBuilder sb = new StringBuilder();
		boolean firstItem = true;

		for (String item : list) {
			if(firstItem) {
				sb.append(item);
				firstItem = false;
			} else {
				sb.append(" * ").append(item);
			}
		}

		return sb.toString(); // StringBuilder is not the same as String
	}
}
