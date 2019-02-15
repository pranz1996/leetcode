package leetcode;

public class _79_word_serarch {

	public static void main(String[] args) {
		char[][] board = {
				{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}
		};
		
		System.out.println(exist(board,"ABCCED"));
	}
	
	 public static boolean exist(char[][] board, String word) {
		
		char wordToChars[] = word.toCharArray();
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(exist(board,i,j,wordToChars,0))
					return true;
			}
		}
		 return false;   
	 }

	private static boolean exist(char[][] board, int i, int j, char[] wordToChars, int k) {
		
		if(k == wordToChars.length)
			return true;
		if(i < 0 || j < 0 || i == board.length || j == board[0].length) 
			return false;
		if(board[i][j] != wordToChars[k])
			return false;
		
		board[i][j] ^= 256;
		boolean exist = exist(board,i,j+1,wordToChars,k+1) || exist(board,i,j-1,wordToChars,k+1) || exist(board,i+1,j,wordToChars,k+1) || exist(board,i-1,j,wordToChars,k+1); 
		board[i][j] ^= 256;
		
		return exist;
	}
}
