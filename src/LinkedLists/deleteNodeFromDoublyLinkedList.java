package LinkedLists;

/* Java implementation to delete a doubly Linked List node 
at the given position */
	
// A node of the doubly linked list 
//class Node { 
//	int data; 
//	Node next, prev; 
//}
//
//public void deleteNodeFromDoublyLinkedList(int pos) {

class DoublyListNode {
    int data;
    DoublyListNode next;  
    DoublyListNode prev;
    public DoublyListNode(int data) { this.data = data; }
} 
public class deleteNodeFromDoublyLinkedList {
	public DoublyListNode deleteAtPos(DoublyListNode head, int pos) {
		//head case
		//end case 
		//mid case - easy, swap and restore
		if(head == null) {7777777777
			return null;
		} else if(head.next == null) {
			return (pos == 1)? head : null;
		} else {
			DoublyListNode curr = head;
			DoublyListNode prev = null;
			int count = 0;//use 1
			//find pos, then find assign to case, depending on where break happened after the statement
			while(curr != null) {
				if(pos == ++count) {//pos can be greater than count
					break;
				}
				prev = curr;//track 1 behind
				curr = curr.next;//move
			}
			//case of pos at end
			if(count < pos) {//means pos is beyond the list
				return head;//return the head or whatever the prob wants
			} else if(curr.next == null) {//then we are at the tail, nully the last node of the tail, sinc curr.next leaves curr at the tail
				curr.prev = null;//next node is null, so just delete curr, and prevs pointer,
				prev.next = null;
			} else if(curr.prev == null) {//the head post//of use count==1
				DoublyListNode temp = curr.next;
				curr.next.prev = null;
				curr = curr.next; //shift node to the next node we are NOT deleting
				temp = null;//nullify the old position
				return curr;
			} else {//middle case
				DoublyListNode temp = curr.next;
				DoublyListNode temp2 = prev;
				curr = null;
				curr.next = null;//nullfy curr pointer
				curr.prev = null;//nullfy curr prev pointer
				temp.prev = temp2;// curr.next.prev = prev, point back
				temp2.next = temp;// prev.next = curr.next
				return head;
			}
		}
		return head;
	}
}
