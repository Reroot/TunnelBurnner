package Strings;

// Write a method to replace all the spaces in a string with â€˜%20â€™. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the â€œtrueâ€� length of the string.

// Examples:

// Input : "Mr John Smith", 13
// Output : Mr%20John%20Smith

// Input : "Mr John Smith   ", 13
// Output : Mr%20John%20Smith

// A simple solution is to create an auxiliary string and copy characters one by one. Whenever a space is encountered, place %20 in place of it.

// A better solution to do in-place assuming that we have extra space in input string. We fist count number of spaces in input string. Using this count, we can find length of the modified (or result) string. After computing new length we fill the string in-place from end.
class URLifyAGivenString {
	public String URLifyAGivenString(String s) {
    char[] fresh = new char[s.length() * 2];
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i<s.length();i++) {
        if(s.charAt(i) == ' ') {

            //fresh[i] = "%20";//++
            //would need to do this instead.
                       // inserts %20 in place of space 
                    //    if (new_str[j] == ' ')  
                    //    { 
                    //        str[index] = '0'; 
                    //        str[index - 1] = '2'; 
                    //        str[index - 2] = '%'; 
                    //        index = index - 3; 
                    //    }  
            sb.append("%20");
        } else {
            fresh[i] = s.charAt(i);
            sb.append(s.charAt(i));
        }
    }
    return sb.toString();

}

}

//
//// Java implementation of above approach 
//class GFG 
//{ 
//    public static void main(String[] args)  
//    { 
//        // Instantiate the string 
//        String str = "Mr John Smith   "; 
//          
//        // Trim the given string 
//        str = str.trim(); 
//          
//        // Replace All space (unicode is \\s) to %20 
//        str = str.replaceAll("\\s", "%20"); 
//          
//        // Display the result 
//        System.out.println(str); 
//    } 
//} 
//
//
//// A better solution to do in-place assuming that we have extra space in input string. We fist count number of spaces in input string. Using this count, we can find length of the modified (or result) string. After computing new length we fill the string in-place from end.
//// filter_none
//// edit
//// play_arrow
//
//// brightness_4
//// Java program to replace spaces with %20  
//class GFG 
//{ 
//  
//    // Maximum length of string 
//    // after modifications. 
//    static int MAX = 1000; 
//  
//    // Replaces spaces with %20 in-place 
//    // and returns new length of modified string. 
//    // It returns -1 if modified string 
//    // cannot be stored in str[] 
//    static char[] replaceSpaces(char[] str) 
//    { 
//  
//        // count spaces and find current length 
//        int space_count = 0, i = 0; 
//        for (i = 0; i < str.length; i++) 
//            if (str[i] == ' ') 
//                space_count++; 
//  
//        // count spaces and find current length 
//        while (str[i - 1] == ' ') 
//        { 
//            space_count--; 
//            i--; 
//        } 
//  
//        // Find new length. 
//        int new_length = i + space_count * 2; 
//  
//        // New length must be smaller than length 
//        // of string provided. 
//        if (new_length > MAX) 
//            return str; 
//  
//        // Start filling character from end 
//        int index = new_length - 1; 
//  
//        char[] new_str = str; 
//        str = new char[new_length]; 
//  
//        // Fill rest of the string from end 
//        for (int j = i - 1; j >= 0; j--)  
//        { 
//  
//            // inserts %20 in place of space 
//            if (new_str[j] == ' ')  
//            { 
//                str[index] = '0'; 
//                str[index - 1] = '2'; 
//                str[index - 2] = '%'; 
//                index = index - 3; 
//            }  
//              
//            else 
//            { 
//                str[index] = new_str[j]; 
//                index--; 
//            } 
//        } 
//        return str; 
//    }