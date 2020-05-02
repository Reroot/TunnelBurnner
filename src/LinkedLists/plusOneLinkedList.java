package LinkedLists;

import java.util.HashMap;

import LinkedLists.ListNode;

//Given a non-negative integer represented as non-empty a singly linked list of digits, plus one to the integer.
//
//You may assume the integer do not contain any leading zero, except the number 0 itself.
//
//The digits are stored such that the most significant digit is at the head of the list.
//
//Example :
//
//Input: [1,2,3]
//Output: [1,2,4]

public class plusOneLinkedList {
	  public ListNode plusOneA(ListNode head) {
		    // sentinel head
		    ListNode sentinel = new ListNode(0);
		    sentinel.next = head;
		    ListNode notNine = sentinel;
		    // find the rightmost not-nine digit
		    while (head != null) {
		      if (head.data != 9) notNine = head;
		      head = head.next;
		    }   
		    // increase this rightmost not-nine digit by 1
		    notNine.data++;
		    notNine = notNine.next;
		    // set all the following nines to zeros
		    while (notNine != null) {
		      notNine.data = 0;
		      notNine = notNine.next;
		    }
		    return sentinel.data != 0 ? sentinel : sentinel.next;
}
	  
//	public ListNode plusOne2ndTry(ListNode head)  {
//		//intuition2 -- or reverse, add, else wipe node till we can, then rev back
//		ListNode curr = head;//stack -- 1,2,9 --.next=0, and prev 0
//		ListNode prev = null;
//		//add all 9 and there iteration in the node
//		rev(curr, prev);
//		
//		while(prev != null) {
//			if(prev.data < 9) {
//				prev.data++;
//				rev(prev, head);//restore updated with one. reversed 
//				return head;
//			} else {
//				prev.data = 0;
//				prev = prev.next;//now go opp way and try again
//			}
//		}
//		return head;
//	}
//	
//	private void rev(ListNode curr, ListNode prev) {
//		while(curr.next != null) {//REVERSE LINKED LIST
//			ListNode temp = curr.next;
//			curr.next = prev;
//			prev = curr;
//			curr = temp;//branch of original 
//		}
//	}
	public ListNode plusOne4(ListNode head) {
	    ListNode h2 = reverse(head);
	 
	    ListNode p=h2;
	 
	    while(p!=null){
	        if(p.data+1<=9){
	            p.data=p.data+1;
	            break;
	        }else{
	            p.data=0;
	            if(p.next==null){
	                p.next = new ListNode(1);
	                break;
	            }
	            p=p.next;
	        }
	    }
	 
	    return reverse(h2);
	}
	 
	public ListNode reverse(ListNode head){
	    if(head==null||head.next==null)
	        return head;
	 
	    ListNode p1=head;
	    ListNode p2=p1.next;
	    while(p2!=null){
	        ListNode t = p2.next;
	        p2.next=p1;
	        p1=p2;
	        p2=t;
	    }
	 
	    head.next=null;
	 
	    return p1;
	}
	public ListNode plusOne(ListNode head)  {
		return head;
//		//new need to traverse to the end with a cur as head, once curr.next = null
//		//we are at the last element, if the element is less that 9
//		//if it's not less that 9 we need to insert a new node. So create one and 
//		//insert it in between where the 9 check passes, count to where the 9 check is
//		//we would have to run a check again
//		ListNode curr = head;//stack -- 1,2,9 --.next=0, and prev 0
//		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
//		int count = 1;
//		//add all 9 and there iteration in the node
//		while(curr.next != null) {//right before [stopped here]->[]->Null
//			curr = curr.next;
//			count++;
//		}
//		if(curr.next.data != 9) {
//			curr.next.data = curr.next.data+1;
//			count--;
//			//run the loop
//			run(count, head); //untill it's all updated;
//			return head;
//		} else {
//			curr.next.data = 0;
//		}
//		return head;
//		
//	}
//	
//	private void run(int count, ListNode head) {
//		ListNode temp = head;
//		int ctr = count;
//		while(ctr != 0) {
//			temp = temp.next;
//			//if else --try to plus one, else return run(ctr - 1);
//			//else -- at a new node to head, and iteratee 9s and add a new head, 
//		}
		
	}

	public static void main(String[] args) {
		//intuition2 -- or reverse, add, else wipe node till we can, then rev back

	}

}
