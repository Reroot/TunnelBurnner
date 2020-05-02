package FireCode;

public class deleteNodeAtPosition {
//	Given a singly-linked list, implement a method to delete the node at a given position (starting from 1 as the head position) and return the head of the list. Do nothing if the input position is out of range.
//
//			Examples:
//
//			LinkedList: 1->2->3->4 , Head = 1
//
//			deleteAtMiddle(Head,3) ==> 1->2->4
// try 1, passing 3 cases, null issues	
	public ListNode deleteAtMiddle(ListNode head, int position) {
        ListNode curr = head;
        ListNode prev = curr;
        int count = 0;
        if(head == null) return null;
        if(position == 1) return head == null ? head : head.next;
        while(curr != null) {//need better control here, remove internally
        	//as we are getting issues
            if(count == position) {//very end case
            	prev.next = curr.next;
            	curr.next = null;//dislocate pointer
            } else {
            	prev = curr;
            	curr = curr.next;
            }
        	
        	prev = curr;
            curr = curr.next;
            count++;
            
            
        }//break at prev
        return head;  
	}
	public ListNode deleteAtMiddle2(ListNode head, int position) {
	    ListNode curr = head;
	    ListNode prev = curr;
	    int count = 0;
	    if(head == null) return head;
	    if(position == 1) return head == null ? head : head.next; 
	    while(curr != null) {
	        count++;
	        if(position == count) {
	            prev.next = curr.next;
	            curr = null;
	            return head;
	        } else {
	            prev = curr;
	            curr = curr.next;
	        }
	    }
	    return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
