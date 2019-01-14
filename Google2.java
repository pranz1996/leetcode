package leetcode;

public class Google2 {

	public static void main(String[] args) {
		int A[] = {-1, 0, 4, 2, 1};
		int D = 2;
		
	      int ancestor[] = new int[A.length];
	        
	        int counter;
	        
	        // traverse through all nodes
	        for(int i = 0; i < A.length; i++){
	            
	        	counter = D;
	        	
	            // find parent of node
	            int temp = A[i];
	            
	            // D times finding parent of node 
	            while(counter > 0){
	                System.out.println(" i counter " + i + " " + counter);
	                // in between or at end, if root node is found 
	                if(temp == -1){
	                    ancestor[i] = -1;
	                    break;
	                } else{ // update parent node
	                    temp = A[temp];
	                }
	                counter--;
	            }
	            // insert parent into ancestor array
	            ancestor[i] = temp;
	        } 
	   
		
	      for(int i = 0 ; i < A.length ; i++){
	    	  System.out.print(ancestor[i] + " ");
	      }
		
	}

}
