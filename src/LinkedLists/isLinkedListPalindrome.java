package LinkedLists;

import java.util.Stack;

public class isLinkedListPalindrome {
	//2nd try pass
    public boolean isPalindrome2(ListNode head) {
        //reverse and compare
        //we can use a stack and stack, pop out halfway
        //fast and slow pointers, where slow will be the half way, use two dummys and compare
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy; 
        Stack<Integer> stk = new Stack<Integer>();
        while(curr.next != null) {
            curr = curr.next;
            stk.push(curr.data);//to get the back
           
        }
        //curr = curr.next;
        //slow = slow.next;//will act as out mid point
        while(!stk.isEmpty()) {
            if(head.data != stk.pop()) {
                return false; 
            } 
            head = head.next;
        }
        
        return true;
        
    }
	//try one 
    public static boolean isPalindrome(ListNode head) {
        //reverse and compare
        //we can use a stack and stack, pop out halfway
        //fast and slow pointers, where slow will be the half way, use two dummys and compare
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        ListNode curr = dummy; 
        Stack<ListNode> stk = new Stack<ListNode>();
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            stk.push(slow);//to get the back
        }

        //slow = slow.next;//will act as out mid point
        curr = curr.next;//BECUASE IT WAS STILL AT OUT DUMMY 0
        while(!stk.isEmpty() || curr.next != slow) {
            if(curr.data != stk.pop().data) {
                return false; 
            } 
            curr = curr.next;
        }
        
        return true;
        
    }
    
    public static void main(String[] args) {
		ListNode r = new ListNode(1);
		r.next = new ListNode(2);
		//r.next.next = new ListNode(2);
		//r.next.next.next = new ListNode(1);
		//r.next.next.next.next = new ListNode(5);

	    System.out.println(isPalindrome(r));
	}
}
