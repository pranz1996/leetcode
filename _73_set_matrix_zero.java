package leetcode;

public class _73_set_matrix_zero {

	public static void main(String[] args) {
		int arr[][] = { {1,2,3,4},
						{3,4,5,6}};
		
		setZeroes(arr);
	}
	
	public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int i, j, temp = 1;
        for( i = 0; i < m; i++){
            if(matrix[i][0] == 0) 
                temp = 0;
            for(j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                   matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        
        for( i = m -1; i >= 0 ; i--){
            for( j = n-1; j >=  1; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
            if(temp == 0)
                matrix[i][0] = 0;
        }
    }
	
}
