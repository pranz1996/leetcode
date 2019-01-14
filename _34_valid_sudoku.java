package leetcode;

import java.util.HashSet;
import java.util.Set;

public class _34_valid_sudoku {

	private static Set<Character> set = new HashSet<>();
	public static void main(String[] args) {
		char[][] board = {
				{'.','.','4','.','.','.','6','3','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'5','.','.','.','.','.','.','9','.'},
				{'.','.','.','5','6','.','.','.','.'},
				{'4','.','3','.','.','.','.','.','.'},
				{'.','.','.','7','.','.','.','.','.'},
				{'.','.','.','5','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				};
		System.out.println(isValidSudoku(board));
	}

	public static boolean isValidSudoku(char[][] board) {
		
		for(int i=0;i<9;i++){
		       if(valid(board,i,i,0,8)==false) return false;
		       if(valid(board,0,8,i,i)==false) return false;
		 } 
		 
		 for(int i = 0 ; i < 9; i += 3) {
			 for(int j = 0; j < 9; j += 3) {
				 if(valid(board,i,i+2,j,j+2) == false)
					 return false;
			 }
		 }
		return true;
	    }

	private static boolean valid(char[][] board, int row1, int row2, int col1, int col2) {
		set.clear();
		for(int i = row1; i <= row2; i++) {
			for(int j = col1; j <= col2; j++) {
				if(board[i][j] != '.') {
					if(!set.add(board[i][j])) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
