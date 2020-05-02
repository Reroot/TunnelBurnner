package FireCode;

public class reverseString {
	public static String revString(String str){
	    if(str == null) return null; 
	    char[] strC = str.toCharArray();
	    int high = str.length()-1;
	    int low = 0;

	    while(low < high) {
	        //two pointers
	        char temp = strC[low];
	        strC[low] = strC[high];
	        strC[high] = temp;
	        low++;
	        high--;
	    }
	    return String.valueOf(strC);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
