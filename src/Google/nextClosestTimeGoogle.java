package Google;
// Given a time represented in the format "HH:MM", form the next closest time by reusing the current digits. \
//There is no limit on how many times a digit can be reused.

// You may assume the given input string is always valid. For example, "01:34", "12:09" are all valid. "1:34", "12:9" are all invalid.
// Example 1:

// Input: "19:34"
// Output: "19:39"
// Explanation: The next closest time choosing from digits 1, 9, 3, 4, is 19:39, which occurs 5 minutes later. It is not 19:33, because this occurs 23 hours and 59 minutes later.
import java.util.*;

class nextClosestTimeGoogle {
    public String nextClosestTimeGoogle(final String time) {
        //convert to minuites, parse the string
        int mins = Integer.parseInt(time.substring(0, 2)) * 60;
        mins += Integer.parseInt(time.substring(3)) * 60;
        HashSet<Integer> digits = new HashSet<Integer>();

        for(char c : time.toCharArray()) {
            digits.add(c - '0');
        }

        while(true) {
            mins = (mins+1) % (24 * 60);
            int[] nextTime = { mins / 60 / 10, mins / 60 % 10, 
                mins % 60 / 10, mins % 60 % 10};
                boolean isValid = true;
                for(int dig : nextTime) {
                    if(!digits.contains(dig)) {
                        isValid = true;
                    }
                }
                if(isValid) {
                    return String.format("%02d:%02d", mins / 60, mins % 60);
                }
        }
    
    
    }
}