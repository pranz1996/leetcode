package leetcode;

import java.util.Collections;

import leetcode.ListNode;
public class _19_remove_nth_node_from_last {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		
		head = removeNthFromEnd(head,1);
		
		ListNode temp = head;
		while(temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
	
	public static ListNode removeNthFromEndOptimized(ListNode head, int n) {
		ListNode main_ptr = head;
		ListNode ref_ptr = head;
		int count = 0;
		while(count < n) {
			ref_ptr = ref_ptr.next;
			count++;
		}
		
		while( ref_ptr != null) {
			main_ptr = main_ptr.next;
			ref_ptr = ref_ptr.next;
		}
		
		System.out.println(" nth node from last " + ref_ptr.val);
		
		return head;
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = LengthOfList(head);
        int del = length - n + 1;
        
        ListNode temp = head;
        
        int i = 1;
        while(i < del-1){
            temp = temp.next;
            i++;
        }
        
        ListNode toBeDelete = temp.next;
        System.out.println(toBeDelete.val);
        if(toBeDelete != null)
            temp.next = temp.next.next;
        
        if(head == null)
            return (ListNode) Collections.EMPTY_LIST;
        
        
        
        return head;
    }
    public static int LengthOfList(ListNode head){
        int counter = 0;
        while(head != null){
            counter++;
            head = head.next;
        }
        return counter;
    }
}
