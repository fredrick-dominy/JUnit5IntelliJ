package com.javatests;

class ArithmeticFunction
{

	private static final String ADD = "add";
	private static final String SUB = "subtract";
	private static final String MULT = "multiply";
	private static final String DIV = "divide";

	static int arithmetic(int a, int b, String operator)
	{
		switch (operator)
		{
			case ADD:
				return sumAB(a, b);

			case SUB:
				return diffAB(a, b);

			case MULT:
				return productAB(a, b);

			case DIV:
				return ratioAB(a, b);

			default:
				return 0;
		}
	}

	private static int ratioAB(int a, int b)
	{
		if (b != 0)
		{
			return a / b;
		}
		return 0;
	}

	private static int productAB(int a, int b)
	{
		return a * b;
	}

	private static int diffAB(int a, int b)
	{
		return a - b;
	}

	private static int sumAB(int a, int b)
	{
		return a + b;
	}

}
