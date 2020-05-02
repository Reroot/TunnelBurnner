package FireCode;

public class insertNewNodeAtHead {
	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.
//	Write a method to insert a node at the front of a singly-linked list and return the head of the modified list.
//			Examples:
//
//			LinkedList: 1->2 , Head = 1
//			InsertAtHead(Head,1) ==> 1->1->2
//			InsertAtHead(Head,2) ==> 2->1->2
//			InsertAtHead(Head,3) ==> 3->1->2
	public ListNode insertAtHead(ListNode head, int data) {
	        ListNode newH = new ListNode(data);
	        newH.next = head;
	       
	        return newH;
	}
	
	public ListNode insertAtHead3(ListNode head, int data) {
	    ListNode newHead = new ListNode(data);
	    //newHead.data = data;
	    newHead.next = head;
	    return newHead;
	}
	
	public ListNode insertAtHead2(ListNode head, int data) {
	    ListNode insert = new ListNode(data);
	    if(head != null) {
	        insert.next = head; 
	        } else {
	            return insert;
	        }
	    return insert;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//LISTNODE IS SHARED PUBLICLY IN THE DELETE NODE CLASS
//class ListNode {
//	int data = 0;
//	ListNode next = null;
//	
//	ListNode(int x) {
//		data = x;
//	}
//	
//}