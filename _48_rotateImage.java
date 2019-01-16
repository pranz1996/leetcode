package leetcode;

public class _48_rotateImage {

	public static void main(String[] args) {
		int matrix[][] = {
				{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}
		};
		rotate(matrix);
		for(int i = 0; i < matrix[0].length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void rotate(int[][] matrix) {
        int length = matrix[0].length;
        int counter;
        int i = 0, j = length - 1;
        while( i < j) {
        	counter = 0;
        	while(counter < length) {
        		swap(matrix, counter, i, j);
        		counter++;
        	}
        	i++; j--;
        }
        
        i = 0; j = 0;
        for(i = 0; i < length; i++) {
        	for(j = i+1; j < length; j++) {
        		swapAgain(matrix, i, j);
        	}
        }
    }
	public static void swapAgain(int[][] matrix, int i, int j) {
		int temp = matrix[i][j];
		matrix[i][j] = matrix[j][i];
		matrix[j][i] = temp;
	}
	public static void swap(int[][] matrix, int counter, int i, int j) {
		int temp = matrix[i][counter];
		matrix[i][counter] = matrix[j][counter];
		matrix[j][counter] = temp;
	}
}
