package FireCode;

import java.util.HashMap;
import java.util.*;

public class isAnagrams {
	//best code 2nd try
	public static boolean isAnagram(String input1, String input2) {
	    if(input1 == null && input2 == null) return false;
	    if(input1 == null || input2 == null) return false;
	    if(input1.length() != input2.length()) return false;

	    int[] flagger1 = new int[256];
	    int[] flagger2 = new int[256];
	    for(int i = 0;i<input2.length();i++) {
	        flagger1[input1.charAt(i)]++;
	        flagger2[input2.charAt(i)]++;
	    }//flag locations of counts at array indexes
	    
	    for(int i = 0;i<256;i++) {
	        if(flagger1[i] != flagger2[i]) {
	            return false;
	        }
	    }
	    return true;
	    
	}
//	Write a method isAnagram that checks if two lowercase input 
//	Strings are anagrams of each other. An anagram of a String is a 
//	String that is formed by simply re-arranging its letters, using 
//	each letter exactly once. Your algorithm should run in linear O(n)
//	time and use constant O(1) space. //1st try
	public static boolean isAnagramMine(String input1, String input2) {
		if(input1.length() != input2.length()) return false;
		//if all elements exist in the same count then we can make an anagram
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		char[] s1c = input1.toCharArray();
		char[] s2c = input2.toCharArray();
		for(int i = 0;i<input1.length();i++) {
			map1.put(s1c[i], map1.getOrDefault(i, 1)+1);
			map2.put(s2c[i], map2.getOrDefault(i, 1)+1);
		}
		
		Set<Character> c = map1.keySet();
		//Set<Character> s = map2.keySet();

		for(char x : c) {
			if(map1.get(x) == map2.get(x) && map2.containsKey(x)) {//check if contains and 
				//count is the same
				return true;
			}
		}
		
		return false;
	    
	}
	//ALT SOL 2
    /* Sorting two input strings and comparing them to find out if they are anagrams of each other. */
    public static boolean isAnagram2(String input1, String input2) {
        //base cases
    	if(input1 == null || input2 == null || (input1.length() != input2.length()))
        {
            return false;
        }
    	//O(n log(n))
      char[] input1Chars = input1.toCharArray();
      char[] input2Chars = input2.toCharArray();
      // Inbuilt sorting
      Arrays.sort(input1Chars);
      Arrays.sort(input2Chars);
      String sorted1 = new String(input1Chars);
      String sorted2 =  new String(input2Chars);
      if(sorted1.equals(sorted2)) {
          return true;
      }
      return false;
   }
    
    
    /* Storing the frequency of the characters in count arrays, comparing them to find out if they are anagrams of each other or not.*/  
    public static boolean isAnagramBest(String input1, String input2)
    {
        if(input1 == null || input2 == null || (input1.length() != input2.length()))
              {
                 return false;
              }
              char [] str1Array = input1.toCharArray();
              char [] str2Array = input2.toCharArray();
                
                        
               int [] count1 =new int[256];
               int [] count2 =new int[256];
               int i;
               for (i = 0; i < str1Array.length;  i++)
                  {
                   count1[str1Array[i]]++;
                   count2[str2Array[i]]++;
                   }
               //Since we only traverse the input string once, the complexity is O(n).
               // Compare count arrays
               for (i = 0; i < 256; i++)
                   if (count1[i] != count2[i])
                   {
                    return false;
                   }
               return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isAnagramMine("cat", "tca"));
		System.out.println(isAnagram2("cat", "tca"));
	}

}
