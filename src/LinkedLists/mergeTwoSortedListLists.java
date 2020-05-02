package LinkedLists;

public class mergeTwoSortedListLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        ListNode head = new ListNode(0);
        ListNode curr = head;

        while(l1 != null && l2 != null) {
            if(l1.data < l2.data) {
                //curr.next = l1;
                curr.next = new ListNode(l1.data);
                l1 = l1.next;
            } else {
                curr.next = new ListNode(l2.data);
                //curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        
        if(l1 == null && l2 !=null) {
            curr.next = l2;
        }
        if(l1 != null && l2 ==null) {
            curr.next = l1;
        }
        
        return head.next;
            
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
