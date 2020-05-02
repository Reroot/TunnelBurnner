package LinkedLists;

public class removeNthNode {

	    public ListNode removeFound(ListNode head, int n) {
	        //save head
	        //itertaite with a prev and a curr, stop at n
	        //skip n and set to 0, return head. 
	        ListNode curr = head;
	        ListNode prev = null;
	        while(curr != null) {
	            if(curr.data == n) {
	                //we need to stop here
	                prev = curr.next;
	                curr = null;
	                return head;
	            } 
	            prev = curr;//set prev
	            curr = curr.next;//contunine
	        }//once we break we can use prev to skip

	        return head;
	    }
	    ///works but naive and delete one node forward
//	    [1,2,3,4,5]
//	    2
//	    		Output:
//	    		[1,2,3,4]
//	    		Expected:
//	    		[1,2,3,5]
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
		// TODO Auto-generated method stub

	}

}
