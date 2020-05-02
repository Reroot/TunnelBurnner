package LinkedLists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode temp = curr.next;//preserve iteration
            curr.next = prev;//flip pointers
            prev = curr;//ready prev for next flip
            curr = temp;//orginal place iteration flow
        }
        return prev;//THE LAST NOW IS THE NEW HEAD OF THE REVERSED LIST!!!!
    } 


// initial:
// 1 -> 2 -> 3 -> 4 -> 5

// after reverseList(2):
// 1 -> 2 <- 3 <- 4 <- 5
//      |
//     null
	
// after operate on 1:
// null <- 1 <- 2 <- 3 <- 4 <- 5
// Code:
public ListNode reverseList2(ListNode head) {
    // base case
    if(head == null || head.next == null) return head;
    
    ListNode newHead = reverseList(head.next);
    
    head.next.next = head;
    head.next = null;

    return newHead;
}
}



// time complexity: O(n)
// space complexity: O(n)