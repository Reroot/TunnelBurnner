package FireCode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

//Find the Number that Appears Once New
//Arrays Hash-Tables Numbers Miscellaneous   
//
//Your solution is incorrect. Click me for details.
//Write a method that returns a number that appears only once in an array.
//Assume the array will surely have a unique value. The array will never be empty.
//Examples:
//
//{1,2,3,4,1,2,4,3,5} ==> 5
public class singleNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(single(new int[] {1, 1, 3}));
	}
	
	public static int singleNumber4(int[] A) {
	    Hashtable<Integer, Integer> m = new Hashtable<Integer, Integer>();
	    for(int i = 0;i<A.length;i++) {
	            m.put(A[i], m.getOrDefault(A[i], 0)+1);
	    }
	    Set<Integer> s = m.keySet();
	    for(int c : s) {
	        if(m.get(c) == 1) {
	            return c;
	        }
	    }
	    return 0;
	}
	public static int singleNumber2(int[] A) {
	    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
	    
	    for(int i = 0;i<A.length;i++) {
	        if(m.containsKey(A[i])) {
	            m.put(A[i], m.getOrDefault(i,1)+1);
	        } else {
	            m.put(A[i], 1);
	        }
	    }
	    Set<Integer> s = m.keySet();
	    for(int i : s) {
	        if(m.get(i) == 1) {
	            return i;
	        }
	    }
	    return 0;
	}
	private static int single(int[] A) {
		// TODO Auto-generated method stub
		Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
	    
	    int len = A.length - 1;
	    int number = 0;
	    for(int i = 0;i<=len;i++) {
	        if(hash.containsKey(A[i])) {
	            hash.put(A[i], hash.get((A[i]))+1);
	        } else {
	            hash.put(A[i], 1);
	        }
	    }
	    
	    Set<Integer> set = hash.keySet();
	    
	    for(Integer k : set) {
	        if(hash.get(k) == 1) {
	        	number = (int)k;
	        }
	    }

	    return number;
		
	}

}
