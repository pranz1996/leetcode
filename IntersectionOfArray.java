package leetcode;

import java.util.HashMap;

public class IntersectionOfArray {
	static int counter = 0;
	
	public static void main(String[] arg) {
		int num1[] = {4,9,5}, num2[] = {9,4,9,8,4};

		int flag = num1.length > num2.length ? 1 : 0 ;
		
		HashMap<Integer, Integer> hm;
		
		if(flag == 1) {
			hm = makeDict(num1);
		} else {
			hm = makeDict(num2);
		}
		
		int array[];
		
		if(flag == 1) {
			array = makeNewArray(hm, num2);
		} else {
			array = makeNewArray(hm, num1);
		}
	
		
		int answer[] = new int[counter];
		
		for(int i = 0 ; i < answer.length ; i++) {
			System.out.print(i + " ") ;
			answer[i] = array[i];
		}
		System.out.println();
		
		for(int i : answer) {
			System.out.print(i + " ");
		}
	}

	private static int[] makeNewArray(HashMap<Integer, Integer> hm, int[] num) {
		
		int temp[] = new int[num.length];
		int j = 0 ;
		for(int i : num) {
			if(hm.containsKey(i)) {
				temp[j] = i;
				j++;
				counter++;
				if(hm.get(i) != null)
					hm.put(i, hm.get(i) - 1);
			}
		}
		
		return temp;
	}

	private static HashMap<Integer, Integer> makeDict(int[] num) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i : num) {
			if(hm.containsKey(i)) {
				hm.put(i, hm.get(i)+1);
			} else {
				hm.put(i, 1);
			}
		}
		return hm;
	}
}
