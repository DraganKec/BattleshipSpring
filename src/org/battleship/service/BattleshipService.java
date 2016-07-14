package org.battleship.service;

import org.springframework.stereotype.Service;

@Service("battleshipService")
public interface BattleshipService {	

	void addShip(int shipSize);

	boolean checkIsEmpty(int shipSize, int x, int y);

	void fillMatrix();
	
	void addShips(int shipSize, int numberOfShips);
	
	String[][] getBattleshipMap();
}
