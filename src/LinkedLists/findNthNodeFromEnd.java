package LinkedLists;

public class findNthNodeFromEnd {
	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.

	public ListNode findNthNodeFromEnd(ListNode head, int n) {
	               ListNode curr = head;
	               int length = 0;
	               if(head == null || n == 0) return head;
	               while(curr.next != null) {
	                   curr = curr.next;
	                   length++;
	               }
	               if(n > length) return null;
	               curr = head;
	               int diff = length-n;
	               
	               
	               while(diff > 0) {
	                   if(curr != null) {
	                       curr = curr.next;
	                       diff--;
	                   } 
	               }
	               
	                
	                return curr;
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
