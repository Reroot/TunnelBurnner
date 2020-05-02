package FireCode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

//Find the first non-duplicate character in a string. Return null if no unique character is found.
//
//firstNonRepeatedCharacter( "abcdcd" ) --> 'a'
//firstNonRepeatedCharacter( "cbcd" ) --> 'b'
//firstNonRepeatedCharacter( "cdcd" ) --> null
public class firstUniqueCharNonDup {
	public static Character firstNonRepeatedCharacter(String str) {
	    //use map to find the first count of 1
	    HashMap<Character, Integer> m = new HashMap<Character, Integer>();
	    char[] strc = str.toCharArray();
	    for(int i = 0;i<str.length();i++) {
	        if(m.containsKey(strc[i])) {
	            m.put(strc[i], m.get(strc[i])+1);
	        } else {
	            m.put(strc[i], 1);
	            //key=char,value=occurance
	        }
	    }
	    Set<Character> s = m.keySet();
	    for(char c : s) {
	        if(m.get(c) == 1) { //everything else that is over 1 is dup
	            return c;
	        }
	    }
	    return null;
	}
	//2nd ret pass
	public static Character firstNonRepeatedCharacter2(String str) {
		//non dup means count is 1 absolutly
		//the first means the first iteration left to right
		    if(str == null) return null;
		    Hashtable<Character, Integer> map = new Hashtable<Character, Integer>();
		    for(int i = 0;i<str.length();i++) {
		        if(map.containsKey(str.charAt(i))) {
		            map.put(str.charAt(i), map.get(str.charAt(i))+1);//if value not there set to 1
		        } else {
		            map.put(str.charAt(i), 1);//if value not there set to 1
		        }
		    }
		    for(int i = 0;i<str.length();i++) {
		        if(map.get(str.charAt(i)) == 1) {//get the count
		            return str.charAt(i);
		        }
		    }
		    return null;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
