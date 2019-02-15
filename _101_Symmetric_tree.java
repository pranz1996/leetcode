package leetcode;

import java.util.LinkedList;
import java.util.Queue;



public class _101_Symmetric_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static void levelOrderTraversal1(Node root) {
		Queue<Node> qu = new LinkedList<>();
		qu.add(root);
		while(!qu.isEmpty()) {
			Node temp = qu.poll();
			System.out.print(temp.data + " ");
			if(temp.left != null) {
				qu.add(temp.left);
			}
			if(temp.right != null) {
				qu.add(temp.right);
			}
		}
	}
	
	private static void levelOrderTraversal(Node root) {
		Queue<Node> qu = new LinkedList<>();
		qu.add(root);
		while(!qu.isEmpty()) {
			Node temp = qu.poll();
			System.out.print(temp.data + " ");
			if(temp.left != null) {
				qu.add(temp.left);
			}
			if(temp.right != null) {
				qu.add(temp.right);
			}
		}
	}

}
