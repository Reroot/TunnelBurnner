package Google;

public class longestSubWithKDistinctSlidingWindow {
//	Similar Questions: Max Consecutive Ones II.
//	Time complexity: O(n).
//	Space complexity: O(1).
//	Given a string, find the longest substring that contains only two unique characters. For example, given "abcbbbbcccbdddadacb", the longest substring that contains 2 unique character is "bcbbbbcccb".
	public static int lengthOfLongestSubstringKDistinct(String s, int k) {
	    int[] charset = new int[128]; // assume ASCII
	    int maxLen = 0;
	    for (int lo = 0, hi = 0, numDistinct = 0; hi < s.length(); hi++) {
	        char letter = s.charAt(hi);
	        if (charset[letter] == 0) numDistinct++;
	        charset[letter]++;
	        
	        if (numDistinct > k) {
	            letter = s.charAt(lo++);
	            charset[letter]--;
	            if (charset[letter] == 0) numDistinct--;
	        }
	        maxLen = hi - lo + 1;
	    }
	    return maxLen;
	}
	public static void main(String[] args) {
		lengthOfLongestSubstringKDistinct("abcadcacacaca", 2);
	}

}
