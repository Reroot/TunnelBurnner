package Google;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

//Given two 1d vectors, implement an iterator to return their elements alternately.
//For example, given two 1d vectors:
//v1 = [1, 2]
//v2 = [3, 4, 5, 6]
//By calling next repeatedly until hasNext returns false, the order of elements
//returned by next should be: [1, 3, 2, 4, 5, 6].
//Follow up: What if you are given k 1d vectors? How well can your code be extended to such cases?

public class ZigzagIterator {
	
    private static List<Integer> v1;
	private static List<Integer> v2;
	Iterator<Integer> it1;
    Iterator<Integer> it2;
    static int turns;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        this.it1 = v1.iterator();
        this.it2 = v2.iterator();
        turns = 0;
    }

    public int next() {
        if(!hasNext()){
            return 0;
        }
        turns++;
        if((turns % 2 == 1 && it1.hasNext()) || (!it2.hasNext())){
            return it1.next();
        } else if((turns % 2 == 0 && it2.hasNext()) || (!it1.hasNext())){
            return it2.next();
        }
        return 0;
    }

    public boolean hasNext() {
        return it1.hasNext() || it2.hasNext();
    }
    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    public static void main(String[] args) {

    	ZigzagIterator iterator = new ZigzagIterator(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6, 7));
        print(iterator);
        iterator = new ZigzagIterator(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
        print(iterator);
        iterator = new ZigzagIterator(Arrays.asList(1), Arrays.asList(2, 3));
        print(iterator);
        iterator = new ZigzagIterator(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6));
        print(iterator);
    }


    public static void print(ZigzagIterator iterator) {

        System.out.println();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}