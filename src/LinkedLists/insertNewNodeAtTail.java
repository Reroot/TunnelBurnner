package LinkedLists;

public class insertNewNodeAtTail {
//	Write a method to insert a node at the end of a singly-linked list. Return the head of the modified list.
//	Examples:
//
//	LinkedList: 1->2 , Head = 1
//
//	InsertAtTail(Head,1) ==> 1->2->1
//	InsertAtTail(Head,2) ==> 1->2->2
//	InsertAtTail(Head,3) ==> 1->2->3
//	
	public ListNode insertAtTail(ListNode head, int data) {
	    ListNode newNode = new ListNode(data);
	    ListNode curr = head;
	    if(curr == null) return newNode;
	    while(curr.next != null) {
	        curr = curr.next;
	    }
	    curr.next = newNode;
	    return head; 
	}
	public ListNode insertAtTail3(ListNode head, int data) {
	    ListNode newNode = new ListNode(data);
	    ListNode dummyH = head;
	    if(dummyH == null) return newNode;
	    //stop 0->null, stop at last node b4 null
	    while(dummyH.next != null) {//stop at head, becuase next is null
	        dummyH = dummyH.next;
	    }
	    dummyH.next = newNode;
	    return head;
	}
	
	public ListNode insertAtTail1(ListNode head, int data) {
	    ListNode d = head;
	    ListNode s = new ListNode(data);
	    if(head == null) return s;
	    while(head.next != null) {
	        head = head.next;
	    }
	    head.next = s;
	    return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//LinkedList: null
//Node to be inserted: 1
//1
//1
//      Pass
//LinkedList: 1
//Node to be inserted: 2
//1->2
//1->2
//      Pass
//LinkedList: 1->2
//Node to be inserted: 3
//1->2->3
//1->2->3
//      Pass