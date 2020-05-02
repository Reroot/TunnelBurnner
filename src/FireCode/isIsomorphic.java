package FireCode;

import java.util.*;

public class isIsomorphic {
//	Given two strings - input1 and input2, determine if they are isomorphic.
//	Two strings are isomorphic if the letters in one string can be remapped to get the second string. Remapping a letter means replacing all occurrences of it with another letter. The ordering of the letters remains unchanged. You can also think of isomorphism as it is used in chemistry - i.e. having the same form or overall shape. Target linear time and space complexity with your solution.
//
//	Examples:
//	Input 1 : css  
//	Input 2 : dll
//	Output  : true
//
//	Input 1 : css 
//	Input 2 : dle
//	Output  : false
//
//	Input 1 : abcabc 
//	Input 2 : xyzxyz
//	Output  : true
//
//	Input 1 : abcabc 
//	Input 2 : xbexyz
//	Output  : false
	
	//THIS MAKEES MORE SENSE AT LINE 40 as we are getting the char to get the value
	public static boolean isIsomorphicKey(String input1, String input2) {
	    //occ can be remaed if counts are the same, and amount of keys are the same in 
	    //the map
	    if(input1.length() != input2.length()) return false;
	    HashMap<Character, Integer> m1 = new HashMap<Character, Integer>();
	    HashMap<Character, Integer> m2 = new HashMap<Character, Integer>();
	    char[] c1s = input1.toCharArray();
	    char[] c2s = input2.toCharArray();
	    
	    for(int i=0;i<input1.length();i++) {
	        m1.put(c1s[i], m1.getOrDefault(c1s[i], 1)+1);
	        m2.put(c2s[i], m2.getOrDefault(c2s[i], 1)+1);
	        
	        if(m1.get(c1s[i]) != m2.get(c2s[i])) {
	            return false;
	        }
	    }
	    return true; 
	    
	}
	
	
	public static boolean isIso(String s1, String s2) {
		//use char to match with the count of the other
		if(s1.length() != s2.length()) return false;
		Hashtable<Character, Integer> hs1 = new Hashtable<Character, Integer>();
		Hashtable<Character, Integer> hs2 = new Hashtable<Character, Integer>();
		for(int i = 0;i<s1.length();i++) {
			hs1.put(s1.charAt(i), hs1.getOrDefault(s1.charAt(i), 1) + 1);
			hs2.put(s2.charAt(i), hs2.getOrDefault(s2.charAt(i), 1) + 1);
			//during
			System.out.println(hs1.get(i));
			System.out.println(hs2.get(i));
			if(hs1.get(i) != hs2.get(i)) {
				return false;
			}
		}
		return true;
		//hash table sorts the order
//		Collection<Integer> ss1 = hs1.values();
//		Collection<Integer> ss2 =  hs2.values();
		//use equals to check the values
//		for(char c : ss1) {
//			if(hs1.get(c) != hs2.get(c)) { 
//				return false;
//			}
//		}
//		return ss1.equals(ss2);
	}
	
//CLOSER BUT USE EQUALS, THIS IS 2ND TRY
public static boolean isIsomorphic(String input1, String input2) {
    // string is iso if XOR, 00 is true, 11 is true, rest is falsly
    // 2nd way is to map the string twice, and see that the counts match, if len is off, auto fail.
    if(input1.length() != input2.length()) return false;
    if(input1.length() == 1) return true;
    char[] strc1 = input1.toCharArray();
    char[] strc2 = input2.toCharArray();
    int count1 = 0;
    int count2 = 0;
    HashMap<Character, Integer> m1 = new HashMap<Character, Integer>();
    HashMap<Character, Integer> m2 = new HashMap<Character, Integer>();
    for(int i = 0;i<input1.length();i++) {
        m1.put(strc1[i], count1+1);
        m2.put(strc2[i], count2+1);
        count1 = m1.get(strc1[i]);
        count2 = m2.get(strc2[i]);
        
        if(m1.get(i) != m2.get(i)) return false;
    }
    
    return true;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isIso("hsdt", "dssv");
	}

}
