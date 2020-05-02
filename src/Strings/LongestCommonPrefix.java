//Scan all the strings with the same pace, once we reach the end of a string or find a mismatch we return the result.


public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }
    
    for (int i = 0; i < strs[0].length(); i++) {
      for (int j = 1; j < strs.length; j++) {
          //once we hit mismatch
        if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
          return strs[0].substring(0, i);
        }
      }
    }
    
    return strs[0];
  }