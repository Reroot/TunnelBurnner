package LinkedLists;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class findCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        while(head != null) {
            if(set.contains(head)) {
                return true;
            } else {
                set.add(head);

            }
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(slow.next != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        
            if(slow == fast) {
                return true;
            } 

        }
        return false;
    }
}