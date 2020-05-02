package DropBox;
import java.util.Arrays;
import java.util.LinkedList;

class ListNode {
		int data;
		ListNode next;
		ListNode(int data) {
			this.data = data;
			next = null;
		}
	}

public class swapNodesInPairs {
	public ListNode swapPairs3(ListNode head) {
	    ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    ListNode current = dummy;
	    while (current.next != null && current.next.next != null) {
	        ListNode first = current.next;
	        ListNode second = current.next.next;
	        first.next = second.next;
	        current.next = second;
	        current.next.next = first;
	        current = current.next.next;
	    }
	    return dummy.next;
	}
	public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode cur = head;
        ListNode newHead = head.next;
        while (cur != null && cur.next != null) {
            ListNode tmp = cur;
            cur = cur.next;
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
            if (cur != null && cur.next != null) tmp.next = cur.next;
        }
        return newHead;
    }

    public static ListNode swapPairs(ListNode head) {
        if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;//temp node
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }
    public void printList (LinkedList<ListNode> ls) {
        for(ListNode currentString : ls){
            System.out.println(currentString.data);
        }
    }
	public static void main(String[] args) {
        swapNodesInPairs swapNodesInPairs = new swapNodesInPairs();
        //ListNode head6 = new ListNode(new int[]{1, 2, 3, 4, 5});
        /* Start with the empty list. */
        LinkedList<ListNode> ls = new LinkedList<ListNode>();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ls.add(node1);
        ls.add(node2);
        ls.add(node3);
        ls.add(node4);
        ls.forEach(System.out::println);

        System.out.println(Arrays.toString(ls.toArray()));
        for(int i=0;i<ls.size();i++){
            //System.out.println(ls.get(i));
        	//System.out.printl("B4");
            System.out.println(swapPairs(ls.get(i)).data);
        } 
        
        
        //swapNodesInPairs.swapPairs(node1);
        //swapNodesInPairs.printList(ls);
        
        

        
        

        
        //System.out.println(swapNodesInPairs.swapPairs(swapNodesInPairs.printList(ls)).data);
        //System.out.println(swapNodesInPairs.swapPairs2(head6));

	}
	
}


