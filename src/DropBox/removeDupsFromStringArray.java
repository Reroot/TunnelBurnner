package DropBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

//java.util.* and java.util.streams.* have been imported for this problem.
//You don't need any other imports.
public class removeDupsFromStringArray {
	public static ArrayList<String> removeDuplicates2(List<String> input) {
 	// Input: [Hi, Hello, Hey, Hi, Hello, Hey]
	    // Output: [Hello, Hey, Hi]
	    // 1: String set to removeDuplicates
	    // 2: HashMap add all once, don't add it if map already contains
		// works, after a collection sort
		ArrayList<String> ls = new ArrayList<String>();
	    Hashtable<String, Integer> map = new Hashtable<String, Integer>();
	    
	    for(String s : input) {
	        if(map.get(s) == null) { // if value is already 1, dont add to list
	        	map.put(s, 1);
	        	//ls.add(s);
	        } 
	    }
	    //for order
	    Set<String> ss = map.keySet();

	    for(String x : ss) {
	        if(map.get(x) == 1) {
	            ls.add(x);
	        }
	    }
	    Collections.sort(ls);
	    
		return ls;
}

	public static ArrayList<String> removeDuplicates(List<String> input) {
	    // Input: [Hi, Hello, Hey, Hi, Hello, Hey]
	    // Output: [Hello, Hey, Hi]
	    // 1: String set to removeDuplicates
	    // 2: HashMap add all once, don't add it if map already contains
		ArrayList<String> ls = new ArrayList<String>();
	    HashMap<String, Integer> map = new HashMap<String, Integer>();
	    for(String s : input) {
	        if(map.get(s) == 1) { // if value is already 1, dont add to list
	        	continue;
	        } else {
	        	map.put(s, 1);
	        	ls.add(s);
	        }
	    }
		return ls;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
