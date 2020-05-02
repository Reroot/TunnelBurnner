package FireCode;

import java.util.HashMap;
import java.util.Set;

public class allUniqueCharsInAString {
	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.
	public static boolean areAllCharactersUnique2(String str){
	    //256 map
	    //or real map and iter on a count of 1 get the keyset
	    if(str == null || str.length() == 0) return true;
	    if(str.length()==1) return true;
	    char[] ca = new char[256];
	    for(int i = 0;i<str.length();i++) {
	        ca[str.charAt(i)]++;
	    }
	    //fill with the count everytime they are hit
	    for(int i = 0;i<ca.length;i++) { // ca .length becuase it will only set to str length
	        if(ca[i] > 1) {
	            return false;
	        }
	    }
	    
	    return true;


	}
	public static boolean areAllCharactersUnique(String str){
	        if(str == null) {
	            return true;
	        }
	        
			HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		    char[] A = str.toCharArray();
		    
		    for(int i = 0;i<A.length;i++) {
		        if(hash.containsKey(A[i])) {
		            hash.put(A[i], hash.get((A[i]))+1);
		        } else {
		            hash.put(A[i], 1);
		        }
		    }
		    
		    Set<Character> set = hash.keySet();
		    for(Character k : set) {
		        if(hash.get(k) != 1) {
		        	return false;
		        } 
		    }
		    return true;
	}
	
	public static void main(String[] args) {
		System.out.println(areAllCharactersUnique(new String("fakcqnjo")));
	}
}
