package LinkedLists;

public class deleteNodeInMiddle {
    ListNode Delete(ListNode head) {
        if (head == null) return null;
        if (head.next == null) {
            // Node a = new Node(0);
            return null;
        }
        ListNode prev = null;
        ListNode slow_ptr = head;
        ListNode fast_ptr = head;

        //if (head != null) {
            while (fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                prev = slow_ptr;
                slow_ptr = slow_ptr.next;
            }
            prev.next = slow_ptr.next;
        //}
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
