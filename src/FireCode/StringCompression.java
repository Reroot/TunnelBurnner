package FireCode;

import java.util.HashMap;
import java.util.Set;

public class StringCompression {
	
public static String compressString(String text) {
	    
	    HashMap<Character, Integer> h = new HashMap<Character, Integer>();
	    //key is chars, value is the count, that the look up. use get of the current key to get the count.
	    //then build the new String if it apears.
	    StringBuilder sb = new StringBuilder();
	    char[] ctexta = text.toCharArray();
	    for(int i = 0;i<ctexta.length;i++) {
	        if(!h.containsKey(ctexta[i])) {
	            h.put(ctexta[i], 1);
	        } else {
	            h.put(ctexta[i], h.get(ctexta[i])+1); //lookup and add count if it already has apeared. 
	        }
	    }
	    //after weve tracked all the elements
	    Set<Character> cv = h.keySet();
	    for(char c : cv) {
	        sb.append(c); //need the char instance regardless
	        if(h.get(c) > 1) {
	            sb.append(h.get(c)); //then append the number of occourance instead 
	        } 
	    }
	    return sb.toString();
	}
	
	
	
	public static void main(String[] args) {
		
	}
}
