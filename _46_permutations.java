package leetcode;

import java.util.*;

public class _46_permutations {

	static List<List<Integer>> al = new ArrayList<>();
	public static void main(String[] args) {
		int arr[] = {1};
		permute(arr,0,arr.length-1);
		System.out.println(al);
	}
	
	private static void permute(int no[], int l, int r) {
		if(l == r) {
			List<Integer> temp = createList(no);
			al.add(temp);
		} else {
			for(int i = l; i <= r; i++) {
				no = swap(no,l,i);
				permute(no,l+1,r);
				no = swap(no,l,i);
			}
		}
	}

	private static List<Integer> createList(int[] no) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < no.length; i++)
			list.add(no[i]);
		return list;
	}

	private static int[] swap(int[] no, int l, int i) {
		int temp = no[l];
		no[l] = no[i];
		no[i] = temp;
		return no;
	}
}
