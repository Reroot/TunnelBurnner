package Google;

import java.util.HashMap;
import java.util.Set;

public class longestSubStringWithKDistinct {
//	Given a string, find the longest substring that contains only two unique characters. For example, given "abcbbbbcccbdddadacb", the longest substring that contains 2 unique character is "bcbbbbcccb".
//	1. Longest Substring Which Contains 2 Unique Characters
//
//	In this solution, a hashmap is used to track the unique elements in the map. When a third character is added to the map, the left pointer needs to move right.
//	You can use "abac" to walk through this solution.
	public int lengthOfLongestSubstringTwoDistinct(String s) {
	    int max=0;
	    HashMap<Character,Integer> map = new HashMap<Character, Integer>();
	    int start=0;
	    for(int i=0; i<s.length(); i++){
	        char c = s.charAt(i);
	        if(map.containsKey(c)){
	            map.put(c, map.get(c)+1);
	        }else{
	            map.put(c,1);
	        }
	        if(map.size()>2){
	        	//THIS MEANS WE ALREADY HAVE 2x Distinct in the map
	            max = Math.max(max, i-start);
	            while(map.size()>2){
	                char t = s.charAt(start);
	                int count = map.get(t);
	                if(count>1){
	                    map.put(t, count-1);
	                }else{
	                    map.remove(t);
	                }
	                start++;
	            }
	        }
	    }
	 
	    max = Math.max(max, s.length()-start);
	 
	    return max;
	}
//	Now if this question is extended to be "the longest substring that contains k unique characters", what should we do?
	public static int lengthOfLongestSubstringKDistinct(String s, int k) {
	    int result = 0;
	    int i=0;
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	 
	    for(int j=0; j<s.length(); j++){
	        char c = s.charAt(j);
	        if(map.containsKey(c)){
	            map.put(c, map.get(c)+1);
	        }else{
	            map.put(c, 1);
	        }
	 
	        if(map.size()<=k){
	            result = Math.max(result, j-i+1);
	        }else{
	            while(map.size()>k){
	                char l = s.charAt(i);
	                int count = map.get(l);
	                if(count==1){
	                    map.remove(l);
	                }else{
	                    map.put(l, map.get(l)-1);
	                }
	                i++;
	            }
	        }
	 
	    }
	 
	    return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lengthOfLongestSubstringKDistinct("abcadcacacaca", 2);
	}

}
