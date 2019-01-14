package leetcode;



import leetcode.ListNode;
public class _23_merge_K_sorted_list {

	public static void main(String[] args) {
		
	}
	
	
	public ListNode mergeKLists(ListNode lists[], int left, int right) {
		
		if(left < right) {
			int mid = left + (right-left)/2 ; 
			return mergeTwoLists(mergeKLists(lists,left,mid), mergeKLists(lists, mid+1, right));
		}
		
		return lists[left];
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
