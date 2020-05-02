package LinkedLists;

public class removeNthNodeFromEndofList {
	//best solution most understandbale
    public ListNode removeNthFromEnd5(ListNode head, int n) {
        //iter h1 to n
        //iter h2 to null, at the same time iter h1
        //skip the location of where h1 is
        ListNode ls = new ListNode(-1);
        ls.next = head;
        ListNode slow = head;//-1
        ListNode fast = head;//-1
        while(n > 0) {//this stops at the node to be deleted, so the space to delete it before is there
            n--;
            fast = fast.next;//-1 [1, 2]
        }//or we can do it inside the while loop incing fast 3 times, count the 0 >=
        
        if(fast==null) return head.next; 
        fast = fast.next;//Move to node to be deletd, 
        
        while(fast != null) {//runs 3 times, from 3, ends at 5 [-1 [1, 2, *3][*4, *5]] 3*.next==5*.next
            fast = fast.next;//[4, 5]
            slow = slow.next;//[1, 2]
        }
        slow.next = slow.next.next;  
        return ls.next;
    }
	//Corrected and fixed. 
	public static ListNode removeNthFromEnd4(ListNode head, int n) {
	        //iter h1 to n
	        //iter h2 to null, at the same time iter h1
	        //skip the location of where h1 is
	        ListNode slow = head;
	        ListNode fast = head;
	        ListNode dummyHead = head;
	        int count = 0;
	        while(n > 0) {//this runs 2 times, we already have head as 1
	        	n--;
	        	count++;
	            fast = fast.next;
	            System.out.println(fast);
	        }
	        //Most Important Bit
	        if(fast==null) return head.next; 
	        fast = fast.next;//create space inbetween slow and fast
	        System.out.println(fast.data);
	        while(fast != null) {
	            fast = fast.next;
	            slow = slow.next;
	            System.out.println(slow.data);
	        }// the one after the h1 need to be removed
	        slow.next = slow.next.next;  
	        return dummyHead;
	 }

	//failed but close
    public ListNode removeNthFromEnd3(ListNode head, int n) {
        //iter h1 to n
        //iter h2 to null, at the same time iter h1
        //skip the location of where h1 is
        ListNode slow = head;
        ListNode fast = head;
        ListNode dummyHead = head;
        while(fast != null && n-- > 0) {
            fast = fast.next;
        }
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        
        return dummyHead;
    }
 ///works but naive and delete one node forward
//    		[1,2,3,4,5]
//    		2
//    		Output:
//    		[1,2,3,4]
//    		Expected:
//    		[1,2,3,5]
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	            //save head
	            //itertaite with a prev and a curr, stop at n
	            //skip n and set to 0, return head. 
	            ListNode curr = head;
	            ListNode prev = null;
	            int count = 1;
	            //if(head.next == null && n == 1) re
	            ListNode test = head;
	            while(test != null) {
	                test = test.next;
	                count++;
	            }
	            count = count-n;
	            while(count >= 0 && curr.next != null) {
	            	count--;
	                    //we need to stop here
	                prev = curr;//set prev
	                curr = curr.next;//contunine
	            }//once we break we can use prev to skip
	            prev.next = curr.next;
	            curr = null;
	            
	            return head;
	}
	public static void main(String[] args) {

				ListNode r = new ListNode(1);
				r.next = new ListNode(2);
				r.next.next = new ListNode(3);
				r.next.next.next = new ListNode(4);
				r.next.next.next.next = new ListNode(5);

			    System.out.println(removeNthFromEnd4(r, 2));
	}

}
