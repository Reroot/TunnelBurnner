package FireCode;

public class replaceAllSpaces {
	
	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.
	//Record: 5 min answer, 2nd try becuase of typos
	public static  String replace(String a, String b) {
	    StringBuilder sb = new StringBuilder();
	    char[] ac = a.toCharArray();

	    for(int i = 0;i<a.length();i++) {
	        if(ac[i] == ' ') {
	            sb.append(b); // shove entire string into the space char 
	        } else {
	            sb.append(ac[i]);
	        }
	    }
	    return sb.toString();
	}
	
	public static String replace2(String a, String b) {
		// Add your code below this line. Do not modify any other code.

		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < a.length(); i++){
		    char c = a.charAt(i);
		    if(c == ' ') builder.append(b);
		    else builder.append(c);
		}
		return builder.toString();

		// Add your code above this line. Do not modify any other code.
		}
	public static void main(String[] args) {
//		replace("This is a test","/") --> "This/is/a/test"
		System.out.println(replace("This is a test","/"));
		
	}

}
