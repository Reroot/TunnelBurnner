package FireCode;

import java.util.Arrays;

public class isPermutation {
	public static boolean permutation(String str1, String str2) {
	    //store the letter and count, in both strings of a hash map
	    //then run the next one to check if it contains the letter and same salue as the other string.
	    //intuitaiton 2: sort the strings, and then iterate with a match case, (nlogn)
	    if(str1.length() != str2.length()) return false;
	    char[] str1c = str1.toCharArray();
	    char[] str2c = str2.toCharArray();
	    Arrays.sort(str1c);
	    Arrays.sort(str2c);
	    for(int i = 0;i<str1.length();i++) {
	        if(str1c[i] != str2c[i]) {
	            return false;
	        }
	    }

	    return true;
	}
	//O(n)
	public static boolean permutationBetter(String str1, String str2) {
		  if (str1.length() != str2.length()) {
		      return false;
		  }
		      
		  int[] letters = new int[256];
		  char[] str1_arr = str1.toCharArray();
		  // Record all the characters which are in the first string.
		  for (char c : str1_arr) {
		      letters[c]++;
		  }
		  // Remove all the characters of second string from records.
		  for (int i=0; i<str2.length(); i++) {
		      System.out.println(str2.charAt(i));
		      int c = (int) str2.charAt(i);
		      System.out.println(c);
		      // If any character is not found or found more than the number of times 
		      // in the second string, strings are not permutation of each other 
		      if (--letters[c] < 0) {
		          return false;
		      }
		  }
		  return true;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println(permutationBetter("hat", "trk"));
	     //remember ascii, a is 97
	    System.out.println((int)'a');

	}

}
