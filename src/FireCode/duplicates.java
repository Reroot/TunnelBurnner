package FireCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
//Write a method duplicate to find the repeated or duplicate elements in an array.
//This method should return a list of repeated integers in a string with the elements sorted in ascending order (as illustrated below).
//
//
//duplicate({1,3,4,2,1}) --> "[1]"
//
//duplicate({1,3,4,2,1,2,4}) --> "[1, 2, 4]"
//
//
//
//Note: You may use toString() method to return the
//standard string representation of most data structures, and
//Arrays.sort() to sort your result.
public class duplicates {
	//first try
	public static String duplicate5(int[] numbers){
	    TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
	    for(int i = 0;i<numbers.length;i++) {
	        map.put(numbers[i], map.getOrDefault(numbers[i], 0)+1);//key=num , value=count, knowing the key beforehand makes everything
	    }
	    //StringBuilder sb = new StringBuilder();
	    Set<Integer> keys = map.keySet();
	    ArrayList<Integer> arr = new ArrayList();
	    for(Integer k : keys) {
	        if(map.get(k)>1) {
	            //sb.append(k);
	            arr.add(k);
	            //it's a dup
	        }
	    }
	    return String.valueOf(arr);
	}
//	Runtime Complexity
//	O(n log(n))
	public static String duplicate2(int[] numbers){
	    ArrayList<Integer> setList = new ArrayList<Integer>();
	    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
	    if(numbers.length == 0) return setList.toString();
	    int count  = 0;
	    for(int i = 0;i<numbers.length;i++) {
	        m.put(numbers[i], m.getOrDefault(numbers[i], 0)+1);
	    }
	    Set<Integer> setK = m.keySet();

	    for(Integer s : setK) {
	        if(m.get(s) > 1) {
	            setList.add(s);
	        }
	    }
	    return setList.toString();
	}
	public static String duplicate(int[] numbers){
	 //we should use treemap for this as treemap sorts, as we put elements int
	 //the iterate and filter the treemap  
		TreeMap<Integer, Integer> treeM = new TreeMap<Integer, Integer>();
	    for(int i = 0;i<numbers.length;i++) {
	        if(treeM.containsKey(numbers[i])) {//key is the numvalue, value is the count of it
	            treeM.put(numbers[i], treeM.get(numbers[i])+1);
	        } else {
	            treeM.put(numbers[i], 1);
	        }
	    }

	    Set<Integer> set = treeM.keySet();
	    //StringBuilder sb = new StringBuilder();
	    ArrayList<Integer> ls = new ArrayList<Integer>();
	    
	    for(Integer i : set) {
	        if(treeM.get(i) > 1) { //means we have dups
	            ls.add(i);
	        }
	    }
//	    for(Integer i : ls) {
//	        sb.append(i);
//	    }
	    return ls.toString();
	    
	}
	public static void main(String[] args) {

	}
}


