package LinkedLists;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicateElementFromSortedLinkedList {
//	Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).
//	Note: Try not to use extra space. Expected time complexity is O(N). The nodes are arranged in a sorted way.
//
//	Input:
//	First line of input contains number of testcases T. For each testcase, first line of input contains length of linked list and next line contains the linked list data.
//
//	Output:
//	For each testcase, there will be a single line of output which contains linked list with no duplicates.
//
//	User Task:
//	The task is to complete the function removeDuplicates() which should remove the duplicates from linked list. The printing is done automatically by the driver code.
//
//	Constraints:
//	1 <= T <= 100
//	1 <= N <= 104
//
//	Example:
//	Input:
//	2
//	4
//	2 2 4 5
//	5
//	2 2 2 2 2
//	Output:
//	2 4 5
//	2
//
//	Explanation:
//	Testcase 1: In the given linked list 2 ->2 -> 4-> 5, only 2 occurs more than 1 time.
//	Testcase 2: In the given linked list 2 ->2 ->2 ->2 ->2, 2 is the only element and is repeated 5 times.
	// head: head node, only passes some cases
	//CORRECT VERSION WITH HASHSET
	class Solution {
	    public ListNode deleteDuplicates3(ListNode head) {
	        ListNode cur = head;
	        while(head != null && cur.next != null) {
	            if(cur.data == cur.next.data) {
	                cur.next = cur.next.next;
	            } else
	                //keep incrementing
	                cur = cur.next;
	        }
	        return head;
	    }
	}

	public ListNode deleteDuplicates(ListNode head) {
	    Set<Integer> s = new HashSet<Integer>();
	    ListNode cur = head;
	    ListNode pre = new ListNode(0);
	    pre.next = head;
	    while(cur!=null){
	        if(s.contains(new Integer(cur.data))){
	            pre.next = cur.next;
	        }else{
	            s.add(new Integer(cur.data));
	            pre = pre.next;
	        }
	        cur = cur.next;
	    }
	    return head;
	}
	
    ListNode removeDuplicates(ListNode root) {
	Set<Integer> set = new HashSet<Integer>();//yes
	ListNode curr = root;//yes
	ListNode ls = new ListNode(root.data);//yes
	ls.next = root;
	while(curr != null) {
	    if(!set.contains(curr.data)) {
	    	set.add(curr.data);
	        ls = curr;//add to new node list
	    } else {
	        ls.next = curr.next;//SKIP THE NODE ITSA DUP
	        //we can also deref by doing 
	        //prev.next = curr.next, if curr already appeard	    	
	    }
	    curr = curr.next;
	}
	return ls;
}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
