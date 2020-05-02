package LinkedLists;

import LinkedLists.ListNode;

public class deleteTheHeadNodeOfCircularLinkedList {
	//read tjhe question your getting ti wrong becuas eof that, * i the tail
//	Given a circular-linked list, write a function to delete its tail node and return the modified list's head.
//			*x = indicates head node
//			1->2->3->4->*1 ==> 1->2->3->*1
	//pass
	public ListNode deleteAtTail(ListNode head) {
	    ListNode curr = head;
	    ListNode prev = null;
	    if(head.next == null) return null; 
	    while(curr.next != head) {//we need to delete the node before head, so we stop before head, (curr to delete)->(curr.next (head Node))
	        prev = curr;
	        curr = curr.next;
	    }
	    
	    prev.next = head;//reLINK TO THE HEAD BECUASE WE KNOW Iterable
	    curr = null; //WIPE CURR, as it's befoere the head, and the node we need to delete (curr to delete)->(head Node)

	    return head; 


	}
	
	//fail 1
	public ListNode deleteAtHead(ListNode head) {
        //we need the node before head and the node after head
        if(head == null) return null;
        if(head.next == head) return null;
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            prev = curr;
            curr = curr.next;
            if(prev.next == head) {
                prev.next = curr.next;
                curr = null;
                return prev.next;
            }
        }
        return prev; 
}
	//fail 2
	public ListNode deleteAtTail2(ListNode head) {
	    if(head == null) return null;
	    ListNode curr = head.next;
	    ListNode prev = head;
	    while(prev != head) {
	        curr = curr.next;
	        prev = prev.next;
	            //this means curr is at tail
	        if(curr == head && curr.data == head.data) {
	            prev.next = curr.next;//ref the prev of curr to the next of curr
	            curr = null;
	            //now derefreance curr
	        }
	    }
	    return head;
	}
//	Given a circular linked list, implement a method to delete its head node. Return the list's new head node.
//
//	*x = indicates head node
//	1->2->3->4->*1 ==> 2->3->4->*2
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
