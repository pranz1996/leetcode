package leetcode;

import leetcode.ListNode;
public class _21_merge_two_sorted_linkedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		l1.next.next.next = new ListNode(7);
		l1.next.next.next.next = new ListNode(8);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		ListNode head = mergeTwoLists(l1, l2);
		
		Print(head);
	}

	public static void Print(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        
        if(l1 == null){
            return l2;
        }
        
        if(l2 == null){
            return l1;
        }
      
        ListNode temp = dummy;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp.next = new ListNode(l1.val);
                temp = temp.next;
                l1 = l1.next;
            } else {
                temp.next = new ListNode(l2.val);
                temp = temp.next;
                l2 = l2.next;
            }
        }
        while(l1 != null){
            temp.next = new ListNode(l1.val);
            temp = temp.next;
            l1 = l1.next;
        }
        while(l2 != null){
            temp.next = new ListNode(l2.val);
            temp = temp.next;
            l2 = l2.next;
        }
        ListNode willHead = dummy.next;
        dummy = null;
        return willHead;
    }
}
