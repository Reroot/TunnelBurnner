package LinkedLists;

class swapPairs {
    public ListNode swapPairs2(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        
        while(curr.next != null && curr.next.next != null) {//reach is the 2 pairs, ie the min
            ListNode first = curr.next;//->1
            ListNode second = curr.next.next;//->2
            first.next = second.next; // now take 1(->)2 and swap with 2(->)3 == NOW 1->3
            //set the pointers with curr
            curr.next = second; //(2)->1
            curr.next.next = first;//(1)->3
            
            //move curr to the 1 pos at 2->1->3
            curr = curr.next.next;//move to (1)->(where curr.next.next.next is 3)
            
        }
        return dummy.next;
    }
    public static ListNode swapPairs(ListNode head) {
        //go though and swap nodes but not the pointers
        //preserve the orional 
        ListNode dummy = new ListNode(0);//PATTERN TO ACCESS the full head node
        dummy.next = head;//HERE WE LINK the Dummy to use
        ListNode curr = dummy;//HERE WE USE it
        while(curr.next != null && curr.next.next != null) {
            ListNode first = curr.next;//0->1
            ListNode sec = curr.next.next;//1->2
            //save the two node, exactly at 0 and 1
            //now swap the pointer, so 2 points to 1
            
            //THIS ONLY PUTS 1->3, sec is not touched!!
            first.next = sec.next;//so now have 2 point to 1 instead of 3//NOW 1 POINTS TO 3 AS next
            curr.next = sec;//set curr.next to 0->2
            curr.next.next = first;//set set curr.next to 2->3
            //our iteration from first;
            curr = curr.next.next;//go to the pointer of, [2]->1->3
        }
        return dummy.next;
    }
    public static void main(String[] args) {
			ListNode r = new ListNode(1);
			r.next = new ListNode(2);
			r.next.next = new ListNode(3);
			r.next.next.next = new ListNode(4);
			r.next.next.next.next = new ListNode(5);
		    System.out.println(swapPairs(r));
	}

}
