package org.battleship.servis;

import org.springframework.stereotype.Service;

@Service
public interface BattleshipService {	

	public void addShip(int shipSize);

	public boolean checkIsEmpty(int shipSize, int x, int y);

	public void fillMatrix();
	
	public void addShips(int shipSize, int numberOfShips);
	
	public String[][] getBattleshipMap();
}
