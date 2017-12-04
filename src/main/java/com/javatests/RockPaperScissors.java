package com.javatests;

public class RockPaperScissors
{
	static final String ROCK = "rock";
	static final String PAPER = "paper";
	static final String SCISSORS = "scissors";
	static final String PLAYER = "Player ";
	static final String WON = " won!";
	static final String DRAW = "Draw!";

	public static String rps(String player1Hand, String player2Hand)
	{
		int playerNumber = 1;

		if(player1Hand.equals(ROCK))
		{
			playerNumber = player2Hand.equals(PAPER) ? 2 : 1;
		}
		if(player1Hand.equals(PAPER)) {
			playerNumber = player2Hand.equals(SCISSORS) ? 2 : 1;
		}
		if(player1Hand.equals(SCISSORS))
		{
			playerNumber = player2Hand.equals(ROCK) ? 2 : 1;
		}

		return player1Hand.equals(player2Hand) ? DRAW : PLAYER + Integer.toString(playerNumber) + WON;
	}
}
