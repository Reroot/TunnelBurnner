package GoogleFreeBalling;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

//Given two 1d vectors, implement an iterator to return their elements alternately.
//For example, given two 1d vectors:
//v1 = [1, 2]
//v2 = [3, 4, 5, 6]
//By calling next repeatedly until hasNext returns false, the order of elements
//returned by next should be: [1, 3, 2, 4, 5, 6].
//Follow up: What if you are given k 1d vectors? How well can your code be extended to such cases?

public class ZigzagIterator {

    public Queue<Iterator> queue;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        queue = new LinkedList<>();
        if (v1.size() != 0) {//its a linked list so we only need the first element
            queue.offer(v1.iterator());
        }
        if (v2.size() != 0) {//its a linked list so we only need the first element
            queue.offer(v2.iterator());
        }//QUEUE -<
    }
//QUEUE LOOKS LIKE, SO ONLY 2 in but they are both linked lists
//    [0]	Arrays$ArrayItr<E>  (id=42)	
//	'[0]' referenced from:	
//	a	Integer[3]  (id=47)	
//	cursor	0	
//[1]	Arrays$ArrayItr<E>  (id=43)	
//	'[1]' referenced from:	
//	a	Integer[4]  (id=67)	
//	cursor	0	


    public int next() {
        hasNext();
        Iterator it = queue.poll();
        int val = (Integer)it.next();
        System.out.print(val);
        if (it.hasNext()) {
            queue.offer(it);
        }
        return val;
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
    
    public static void main(String[] args) {

    	ZigzagIterator iterator = new ZigzagIterator(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6, 7));
        print(iterator);
//        iterator = new ZigzagIterator(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
//        print(iterator);
//        iterator = new ZigzagIterator(Arrays.asList(1), Arrays.asList(2, 3));
//        print(iterator);
//        iterator = new ZigzagIterator(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6));
//        print(iterator);
    }


    public static void print(ZigzagIterator iterator) {

        System.out.println();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}