package com.javatests;

public class Vowels
{
	public static int getCount(String str)
	{
		int vowelsCount = 0;
		char[] charList = str.toCharArray();

		for (char charItem : charList)
		{
			boolean matchVowel = isVowel(charItem);
			if (matchVowel)
			{
				vowelsCount++;
			}
		}

		return vowelsCount;
	}

	private static boolean isVowel(char charItem)
	{
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};

		for (char vowel : vowels)
		{
			if (vowel == charItem)
			{
				return true;
			}
		}

		return false;
	}
}
