package leetcode;

public class _130_surrounded_regions {

	public static void main(String[] args) {
		char[][] board = {{'O','X','X','O','X'},{'X','O','O','X','O'},{'X','O','X','O','X'},
				{'O','X','O','O','O'},{'X','X','O','X','O'}};
		solve(board);
		
		for(int i = 0; i < board.length; i++) {
			for( int j = 0; j < board[0].length ; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	   public static void solve(char[][] board) {
	        
	        if(board.length == 0) {
	            
	        } else if(! (board.length == 1 && board[0].length == 1) || 
	                    (board.length == 2 && board[0].length == 2) ) {
	            int i = 0, j = 0, m = board.length, n = board[0].length;
	            for( i = 0; i < m; i++) {
	                for( j = 0; j < n ; j++)  {
	                    if(board[i][j] == 'O') {
	                        if( i == 0 || i == m-1 || j == 0 || j == n-1) {
	                        	System.out.println(i + " first " + j);
	                            continue;
	                        } else if( board[i][j-1] == 'O') {
	                        	System.out.println(i + " 1-1 " + j);
	                        	if((j-1) == 0) {
	                        		System.out.println(i + " 1-2 " + j);
	                        		continue;
	                        	}
	                        } else if( board[i][j+1] == 'O') {
	                        	System.out.println(i + " 2-1 " + j);
	                        	if((j+1) == n-1) {
	                        		System.out.println(i + " 2-2 " + j);
	                        		continue;
	                        	}
	                        } else if( board[i-1][j] == 'O') {
	                        	System.out.println(i + " 3-1 " + j);
	                        	if((i-1) == 0) {
	                        		System.out.println(i + " 3-2 " + j);
	                        		continue; 
	                        	}
	                        } else if( board[i+1][j] == 'O') {
	                        	System.out.println(i + " 4-1 " + j);
	                        	if((i+1) == m-1) {
	                        		System.out.println(i + " 4-2 " + j);
	                        		continue;
	                        	}
	                        } else {
	                            System.out.println(i + " done " + j);
	                            board[i][j] = 'X';
	                        }
	                    }
	              }
	            }
	        }
	    }
}


