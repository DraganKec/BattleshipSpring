package org.battleship;

import java.util.Random;

public class BattleshipHelp {
	public static final String emptyField = "1";
	public static final String ship = "6";

	public static int getRandomNumber(int maxNumber) {
		return new Random().nextInt(maxNumber);
	}
}
