package Google;
//your code good job
public class removeSpaces {
	private static String replaceAllSpaces(String inputString) {
	    char[] chars = inputString.toCharArray();
	    StringBuffer stringBuffer = new StringBuffer();
	    for (int i = 0; i < chars.length; i++) {
	        if ((chars[i] != ' ') && (chars[i] != '\t')) {//block out case that we are on a space
	        	stringBuffer.append(chars[i]);//FIRST //then if space is coming, add it in this same loop
	        	if(i<chars.length-1 && chars[i+1] == ' ') {//2nd anything else other than a char is a token
	        		stringBuffer.append(" ");
	        	}
	        }
	    }
	    return stringBuffer.toString();
	}
	private static String replaceAllSpaces2(String inputString) {
		String nameWithProperSpacing = inputString.replaceAll("\\s+", " ");
		return nameWithProperSpacing;

	}
	public static void main(String[] args) {
		System.out.println(replaceAllSpaces("a  cat in   the    hat"));
		System.out.println(replaceAllSpaces2("a  cat in   the    hat"));
		
	}
}
////Given a string of words with lots of spaces between the words , remove all the 
////unnecessary spaces like
//public static String remspaces(String s) {
//	int x = 0; //last good index
//	StringBuilder sb = new StringBuilder();
//	char[] cArr = s.trim().toCharArray();
//	int i = 1;
//	if(s.length() == 2) return String.valueOf(cArr[0]);
//	while(i < s.length()) {
//		if(cArr[i-1] == ' ' && cArr[i] != ' ') {
//			i++; //skip one of the spaces
//		}
//		sb.append(cArr[i]+" ");
//	}
//	return sb.toString();
//}

//Using regular expression, to replace 2 or more white spaces with single space, is also a good solution.
//
//We are using regex pattern as “\\s+”.
//
//\s matches a space, tab, new line, carriage return, form feed or vertical tab.
//+ says one or more occurrences.
//Regex Example
//// uneven spaces between words
//String blogName = "how to   do    in  java   .         com"; 
// 
// 
//System.out.println( nameWithProperSpacing );