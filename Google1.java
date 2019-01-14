package leetcode;

public class Google1 {

	public static void main(String[] args) {
		int stores[] =  {1, 5, 20, 11, 16, 9};
		int house[] = {5, 10, 17};
		
		int nearestStore[] = new int[house.length];
		
		int h, s, min, index;
		
		for( h = 0 ; h < house.length ; h++) {
			min = Math.abs( house[h] - stores[0] );
			index = stores[0];
			for( s = 1 ; s < stores.length ; s++) {
				int temp = Math.abs( house[h] - stores[s]) ;
				if(temp < min) {
					index = stores[s];
					min = temp;
					nearestStore[h] = stores[s];
				} else if(temp == min) {
					if(stores[s] < index) {
						index = stores[s];
						min = temp;
						nearestStore[h] = stores[s];
					}
				}
			}
		}
		
		for(int i = 0 ; i < nearestStore.length ; i++) {
			System.out.print(nearestStore[i] + " ");
		}		
	}

}
  