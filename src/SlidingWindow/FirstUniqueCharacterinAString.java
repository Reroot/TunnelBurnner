package SlidingWindow;

import java.util.HashMap;

// Hey guys. My solution is pretty straightforward. It takes O(n) and goes through the string twice:

// Get the frequency of each character.
// Get the first character that has a frequency of one.
// Actually the code below passes all the cases. However, according to @xietao0221, we could change the size of the frequency array to 256 to store other kinds of characters. Thanks for all the other comments and suggestions. Fight on!

class Solution {
    public int firstUniqChar(String s) {
        int[] abcFlag = new int[26];
        for(int i=0;i<s.length();i++) {
                abcFlag[s.charAt(i) - 'a'] = abcFlag[s.charAt(i) - 'a'] + 1;
        }
        for(int i=0;i<s.length();i++) {
                if(abcFlag[s.charAt(i) - 'a'] == 1) {
                    return i;
                }
        }
        return -1;
    }


    public int firstUniqChar2(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }
}

// Complexity Analysis

// Time complexity : \mathcal{O}(N)O(N) since we go through the string of length N two times.
// Space complexity : \mathcal{O}(N)O(N) since we have to keep a hash map with N elements.
// Analysis written by