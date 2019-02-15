package leetcode;

import java.util.*;

public class _88_Merge_Sorted_Array {

	public static void main(String[] args) {
		 int num1[] = {-1,0,0,3,3,3,0,0,0};
		 int num2[] = {1,2,2};
		 
		 merge(num1, 6, num2, 3);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	    Stack<Integer> st = new Stack<>();
	    
	    int i ;
	    for( i = 0; i < m; i++)
	    	st.add(nums1[i]);
	   
	    while(st != null) { 
	    	if(st.peek() == 0)
	    		st.pop();
	    	else
	    		break;
	    }
	    System.out.println(st);
	    
	    int nums3[] = new int[st.size()];
	    
	    for( i = 0; i < st.size(); i++) {
	    	nums3[i] = st.get(i);
	    } 
	    
	    i = 0; 
	    int j = 0 , k = 0;
	    
	    while(i < nums2.length && j < nums3.length) {
	    	if(nums2[i] <= nums3[j])
	    		nums1[k++] = nums2[i++];
	    	else
	    		nums1[k++] = nums3[j++];
	    }
	    
	    while(i < nums2.length) {
	    	nums1[k++] = nums2[i++];
	    }
	    while(j < nums3.length) {
	    	nums1[k++] = nums3[j++];
	    }
	    Print(nums1);
	}

	private static void Print(int[] num) {
		for(int i = 0; i < num.length; i++)
	    	System.out.print(num[i] + " ");	
		
		System.out.println();
	}
}
