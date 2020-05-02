//package DropBox;
//
//import static org.junit.Assert.*;
//
//import org.junit.*;
//import org.junit.jupiter.api.Test;
//
//public class swapNodesInPairsTest {
//
//    @Test
//    public void swapPairs11() {
//        swapNodesInPairs.ListNode head =  node(1, node(2, node(3, node(4, null))));
//        new swapNodesInPairs().print(head);
//        head = new swapNodesInPairs().swapPairs(head);
//        new swapNodesInPairs().print(head);
//    }
//
//
//	@Test
//    public void swapPairs22() {
//    	swapNodesInPairs.ListNode head =  node(1, node(2, node(3, null)));
//        new swapNodesInPairs().print(head);
//        head = new swapNodesInPairs().swapPairs(head);
//        new swapNodesInPairs().print(head);
//    }
//
//
//    private swapNodesInPairs.ListNode node (int data, swapNodesInPairs.ListNode next) {
//    	swapNodesInPairs.ListNode node = new swapNodesInPairs.ListNode(data);
//        node.next = next;
//        return node;
//    }
//}