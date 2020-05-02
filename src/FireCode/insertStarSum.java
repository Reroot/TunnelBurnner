package FireCode;

public class insertStarSum {
	//nice alternative
	public static String insertPairStar3(String s) {
	    // Add your code below this line. Do not modify any other code.
	    if(s==null || s.length()<=1) return s;
	    return s.charAt(0) + 
	            (s.charAt(0)==s.charAt(1) ? "*" : "") +
	            insertPairStar(s.substring(1));
	    // Add your code above this line. Do not modify any other code.
	}
	//try 3 pass finally**, need to use equals for the type comparision of chars, as == gets
	// comaprars memory
	// try 1
	public static String insertPairStar(String s) {
	    if(s.length() == 0) return "";
	    if(s == null) return null;
	    
	        for(int i = 0;i<s.length();i++) {
	            if(s.charAt(i) == s.charAt(i+1)) {
	                return s.substring(0, 1) + "*" + s.substring(1,2);
	            } else if(s.charAt(i) != s.charAt(i+1)) {
	                return s.substring(0, 1) + s.substring(1,2);
	            } else {
	                return insertPairStar(s);
	            }
	        }
			return s;
	}
	//try 2
	public static String insertPairStar2(String s) {
	    if(s.length() == 0) return "";
	    if(s == null) return null;
	    if(s.length() == 1) return s;
	    if(s.substring(0, 1) == s.substring(1, 2)) return insertPairStar(s.substring(0, 1)) + "*" + insertPairStar(s.substring(1, 2));
	    else {
	        return insertPairStar(s.substring(0, 1)) + insertPairStar(s.substring(1, 2));
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
