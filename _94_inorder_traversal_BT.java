package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
	}
}

public class _94_inorder_traversal_BT {

	public static void main(String[] args) {

	}
	public List<Integer> inorder(TreeNode root){
		List<Integer> list = new ArrayList<>();
		Stack<TreeNode> st = new Stack<>();
		
		while(true) {
			while(root != null) {
				st.push(root);
				root = root.left;
			}
			if(st.isEmpty())
				break;
			
			root = st.pop();
			list.add(root.val);
			root = root.right;
		}
		
		return list;
	}
}
