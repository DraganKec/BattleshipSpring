package org.battleship.sudoku;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface SudokuService {

	Map<String, Integer> generateSudoku();
}
