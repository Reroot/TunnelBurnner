package FireCode;
//Given a Singly-Linked List, write a method - findMiddleNode that finds and returns the middle node of the list in a single pass.
//
//Examples:
//1 ==> 1
//1->2 ==> 1
//1->2->3->4 ==> 2
//1->2->3->4->5 ==> 3
//  Need a hand? Try out these hints, one at a time.
//  A quick hint to get things rolling.
//  Well .. this is almost cheating. But feel free to click this if you're really stuck!
//1. Traverse the list by moving over one reference with twice the speed as that of the of the other reference :
//slow = slow.next
//fast = (fast.next).next
//
//2. Stop the traversal when the faster ListNode reference reaches the end of the linked list.
//
//3. The slower node will invariably be pointing to the middle ListNode. Return slow
public class findTheMiddleOfaLinkedList {
	public ListNode findMiddleNode4(ListNode head) {
	    if(head == null) return null;
		if(head.next == null) return head;
	    ListNode currslow = head;
	    ListNode currfast = head;
	    while(currfast.next != null && currfast.next.next != null) {
	        currslow = currslow.next;
	        currfast = currfast.next.next;
	    }
	    return currslow;
	}
	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.
//	Runtime Complexity
//	O(n) and space O(1)
	//first try 15mins
	public ListNode findMiddleNode(ListNode head) {
	    //we have a slow pointer and a fast pointer, when fast pointer is null then we have our
	    //mid as it moves 2x as fast and slow is half that, ie mid. 
	    if(head == null) return null;
	    if(head.next == null) return head;
	    ListNode slow = head;
	    ListNode fast = head;
	    
	    while(fast.next != null && fast.next.next != null) { //if 1x and 2x are save to tranverse, do the doubling.
	                slow = slow.next;
	                fast = fast.next.next;
	    }
	    return slow;
	}
	//2n try minuites
	public ListNode findMiddleNode2(ListNode head) {
	    ListNode slow = head;
	    ListNode fast = head;
	    if(head == null) return null;
	    while(fast.next != null && fast.next.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    return slow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
