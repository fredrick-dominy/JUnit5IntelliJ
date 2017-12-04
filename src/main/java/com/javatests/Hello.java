package com.javatests;


public class Hello
{
	/**
	 * @param name
	 * @param city
	 * @param state
	 * @return Personalized greeting.
	 */
	public String sayHello(String[] name, String city, String state)
	{
		String fullName = concatFullName(name);
		return "Hello," + fullName + "! Welcome to "+city+", "+state+"!";
	}

	/**
	 * @param name
	 * @return Full name as string.
	 */
	private String concatFullName(String[] name)
	{
		String fullName = "";
		for (String parts : name) {
			fullName = fullName + " " + parts;
		}
		return fullName;
	}
}
