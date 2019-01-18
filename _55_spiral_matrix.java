package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _55_spiral_matrix {

	public static void main(String[] args) {
		int matrix[][] = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14} };
		System.out.println(spiralOrder(matrix));
	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		
		if(matrix.length == 0)
			return list;
		
		int rowstart = 0, rowend = matrix.length - 1;
		int colstart = 0, colend = matrix[0].length - 1;
		int i;
		
		while(rowstart <= rowend && colstart <= colend) {
			// From left to right
			for( i = colstart; i <= colend ; i++) {
				list.add(matrix[rowstart][i]);
			}
			rowstart++;
			
			// up to down
			for(  i = rowstart; i <= rowend; i++) {
				list.add(matrix[i][colend]);
			}
			colend--;
			
			if(rowstart <= rowend) {
				// right to left
				for( i = colend; i >= colstart; i--) {
					list.add(matrix[rowend][i]);
				}
			}
			rowend--;
			
			if(colstart <= colend) {
				// down to up
				for( i = rowend; i >= rowstart; i--) {
					list.add(matrix[i][colstart]);
				}
			}
			colstart++;
			
		}
		
		return list;
    }

}
