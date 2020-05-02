package LinkedLists;

public class deleteListNodeAtEnd {
	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.
public ListNode deleteAtTail(ListNode head) {
	        ListNode prev = head;
	        ListNode curr = head;
	        if(curr == null || curr.next == null) return null;
	        while(curr.next != null) {
	            prev = curr;
	            curr = curr.next;
	        }
	        prev.next = head;//recircle
	        curr.next = null;
	        return head;
}
//ephpianay list nodes refrences share the same pointer,
//not give an extra one
	
//Passed 3/4, next time use a prev to get the last node
//	public ListNode deleteAtTail(ListNode head) {
//	        ListNode curr = new ListNode(0);
//	        curr = head;
//	        if(head == null) return null;
//
//	        while(curr.next.next != null) {
//	            curr = curr.next;
//	        }
//	        
//	        curr.next = null;
//	        curr = null;
//	        return head; 
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
