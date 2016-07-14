package org.battleship;

import java.util.Random;

import org.battleship.servis.BattleshipService;

public class BattleshipLogic implements BattleshipService {
	
	String[][] battleshipMap = new String[10][10];

	private int orientation;
	
	public String[][] getBattleshipMap() {
		return battleshipMap;
	}

	public void addShip(int shipSize) {
		int maxRadnomNumber = 11 - shipSize;

		boolean isPass = true;

		orientation = getRandomNumber(2);
		do {
			int x = getRandomNumber(maxRadnomNumber);
			int y = getRandomNumber(maxRadnomNumber);

			if (checkIsEmpty(shipSize, x, y)) {
				for (int i = 0; i < shipSize; i++) {
					if (orientation == 1) {
						battleshipMap[x][y] = BattleshipHelp.ship;
					} else {
						battleshipMap[y][x] = BattleshipHelp.ship;
					}
					y++;
				}

				isPass = false;
			}
		} while (isPass);

	}

	public void fillMatrix() {

		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				battleshipMap[x][y] = BattleshipHelp.emptyField;
			}
		}
	}

	public boolean checkIsEmpty(int shipSize, int x, int y) {

		int xRepeat = 2;
		int yRepeat = shipSize;

		if (y > 0) {
			if (y + shipSize == 10) {
				yRepeat = shipSize + 1;
			} else {
				yRepeat = shipSize + 2;
			}
			y--;
		} else {
			yRepeat = shipSize + 1;
		}

		if (x > 0) {
			if (x == 9) {
				xRepeat = 2;
			} else {
				xRepeat = 3;
			}
			x--;
		}

		for (int j = 0; j < xRepeat; j++) {
			for (int i = 0; i < yRepeat; i++) {
				if (orientation == 1) {
					if (battleshipMap[x][y].equals(BattleshipHelp.emptyField)) {
						y++;
					} else {
						return false;
					}
				} else {
					if (battleshipMap[y][x].equals(BattleshipHelp.emptyField)) {
						y++;
					} else {
						return false;
					}
				}

			}
			y -= yRepeat;
			x++;
		}
		return true;
	}

	public int getRandomNumber(int maxNumber) {

		Random randomNumber = new Random();

		return randomNumber.nextInt(maxNumber) + 0;
	}

	public void addShips(int shipSize, int numberOfShips) {

		for (int x = 0; x < numberOfShips; x++) {
			addShip(shipSize);
		}

	}

}
