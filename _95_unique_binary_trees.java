package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class theNode{
	int val;
	theNode left;
	theNode right;
	theNode(int x) { val = x ; }
}

public class _95_unique_binary_trees {

	private static List<List<Integer>> al = new ArrayList<>();
	private static List<List<Integer>> answer = new ArrayList<>();
	private static List<theNode> myFinal = new ArrayList<>();
	public static void main(String[] args) {
		
		int n = 3;
		al.clear(); answer.clear(); myFinal.clear();
	    if(n <= 0) {
	       System.out.println(myFinal);
	    }
	    else {
	    	int arr[] = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = i+1;
			permute(arr,0,n-1);
			
			
			for(int i = 0; i < al.size(); i++) {
				theNode temp = makeBinarySearchTree(al.get(i));
				List<Integer> listInorder = preorder(temp);
				if(!answer.contains(listInorder)) {
					answer.add(listInorder);
					myFinal.add(temp);
				}
			}
			System.out.println(myFinal);
	    }
	}

	private static void permute(int no[], int l, int r) {
		if( l == r) {
			List<Integer> list = createList(no);
			al.add(list);
		} else {
			for( int i = l ; i <= r; i++) {
				no = swap(no,l,i);
				permute(no,l+1,r);
				no = swap(no,l,i);
			}
		}
	}

	private static List<Integer> createList(int[] no) {
		List<Integer> al = new ArrayList<>();
		for(int i = 0; i < no.length; i++)
			al.add(no[i]);
		return al;
	}

	private static int[] swap(int[] no, int l, int i) {
		int temp = no[l];
		no[l] = no[i];
		no[i] = temp;
		return no;
	}
	
	public static theNode makeBinarySearchTree(List<Integer> numbers){
        List<Integer> traversal = new ArrayList<>();
        theNode head = null;
        for(Integer i : numbers){
            theNode temp = new theNode(i);
            if(head == null){
                head = temp;
            } else {
                insert(head,temp);
            }
        }
        return head;
    }
    
    private static List<Integer> preorder(theNode root){
        List<Integer> list = new ArrayList<>();
        Stack<theNode> st = new Stack<>();
        while(true){
            while(root != null){
                st.push(root);
                list.add(root.val);
                root = root.left;
            }
            if(st.empty()){
                break;
            }
            root = st.pop();
            root = root.right;
        }
        return list;
    }
    
    private static void insert( theNode root, theNode temp){
        if(temp.val > root.val){
            if(root.right == null)
                root.right = temp;
            else
                insert(root.right,temp);
        } else{
            if(root.left == null)
                root.left = temp;
            else
                insert(root.left, temp);
        }
    }
	
}
