package leetcode;

public class _62_unique_paths {

	public static void main(String[] args) {
		System.out.println(uniquePaths(7, 3));
	}
	public static int uniquePaths(int m, int n) {
	        int[][] mat= new int[m][n];
	        
	        int i = 0, j = 0;
	        
	        for( i = 0; i < m; i++)
	            mat[i][0] = 1;
	        
	        for( j = 0; j < n ; j++)
	            mat[0][j] = 1;
	        
	        for(i = 1; i < m; i++)
	            for(j = 1; j < n; j++)
	                mat[i][j] = mat[i-1][j] + mat[i][j-1];
	    
	        
	        return mat[i-1][j-1];   
	    }

}
