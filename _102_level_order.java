package leetcode;

import java.util.*;

import javax.sound.midi.Soundbank;
class node{
	int val;
	node left;
	node right;
	node next;
	node(int x) {
		val = x;
	}
}
public class _102_level_order {

	public static void main(String[] args) {
		node root = new node(1);
		root.next = null;
		root.left = new node(2);
		root.right = new node(3);
		
		System.out.println(levelOrder(root));
		
		
	}
	
	public static List<List<node>> levelOrder(node root) {
		List<List<node>> list = new ArrayList<>();
		List<node> temp = new ArrayList<>();
		
		Queue<node> curr = new LinkedList<>();
		Queue<node> next = new LinkedList<>();
		
		curr.add(root);
		
		while(!curr.isEmpty()) {
			node k = curr.poll();
			temp.add(k);
			if(k.left != null) 
				next.add(k.left);
			if(k.right != null)
				next.add(k.right);
			if(curr.isEmpty()) {
				setPointers(temp);
				list.add(new ArrayList<node>(temp));
				curr.addAll(next);
				next.clear(); temp.clear(); 
			}			
		}
		return list;
     }

	private static void setPointers(List<node> temp) {
		System.out.println(temp);
		int i = 0;
		for(i = 0; i < temp.size() - 1; i++) {
			temp.get(i).next = temp.get(i+1);
		}
		temp.get(i).next = null;
		
		
		for(i = 0; i < temp.size(); i++) {
			System.out.print(temp.get(i).next + " ");
		}
		System.out.println();
	}
}
