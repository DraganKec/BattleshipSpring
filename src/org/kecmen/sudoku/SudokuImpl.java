package org.kecmen.sudoku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.battleship.BattleshipHelp;
import org.springframework.stereotype.Component;

@Component
public class SudokuImpl implements SudokuService {

	private Map<String, Integer> sudokuMap = new HashMap<String, Integer>();

	public Map<String, Integer> generateSudoku() {

		ArrayList<Integer> listNum = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			listNum.add(i);
		}
		Collections.rotate(listNum, BattleshipHelp.getRandomNumber(9));

		for (int a = 0; a < 9; a++) {
			int b = 0;
			for (int i = 0; i < 9; i++) {
				sudokuMap.put(a + "." + i, listNum.get(b));
				b++;
			}
			if (a == 2 || a == 5) {
				Collections.rotate(listNum, 5);
			} else {
				Collections.rotate(listNum, 6);
			}
		}
		return sudokuMap;
	}
}
