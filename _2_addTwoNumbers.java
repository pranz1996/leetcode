package leetcode;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) 
	{ val = x; }
}

public class _2_addTwoNumbers {
	
}


class Solution {
    static int temp = 0;
    static int index = 0;
    static boolean flag = false, check = false;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode mainNode = l1;
        while(l1 != null && l2!= null){
            index = 0;
            int sum = 0;
            int one = l1.val;
            int two = l2.val;
            sum = one + two;
            if(flag){
                sum += temp;
                flag = false;
            }
            checkTheSum(sum);
            if(flag){
                // checkTheSum(sum + index);
                l1.val = index;
            }else{
                l1.val = sum;
            }
            
            l1 = l1.next;
            if(l1 == null && sum >= 10){
                check = true;
            }
            l2 = l2.next;
        }    
       
        if(check){
            ListNode addNew = mainNode;
            while(addNew.next != null)
                addNew = addNew.next ;
            ListNode Temp = new ListNode(temp);
            addNew.next = Temp;
        }
        
        return mainNode;
    }
    public void checkTheSum(int sum){
        if(sum >= 10) {
            temp = sum / 10;
            index = sum % 10; 
            flag = true;
        }
    }
}
