package LinkedLists;


public class deleteListNode {
	
	public ListNode delNode(ListNode head) {
		ListNode temp = new ListNode(0);
		temp.next = head.next;//point temp to heads next
		head.next = null;
		temp = head;
		
		return temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


////java.util.* and java.util.streams.* have been imported for this problem.
////You don't need any other imports.
//
//public ListNode deleteAtHead(ListNode head) {
//     if(head == null) return null;
//     ListNode temp = new ListNode(0);
//     temp = head.next;
//     head.next = null;
//     head = null;
//     
//     
//     return temp;
//}