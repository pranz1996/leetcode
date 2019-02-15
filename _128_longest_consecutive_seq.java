package leetcode;

import java.util.*;
public class _128_longest_consecutive_seq {

	public static void main(String[] args) {
		int arr[] = {100, 4, 200, 1, 3, 2};
		
		SortedSet<Integer> set = new TreeSet<>();
		for(int i = 0; i < arr.length ; i++)
			set.add(arr[i]);
		
		System.out.println(set);
	}

}
