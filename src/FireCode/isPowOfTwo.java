package FireCode;

public class isPowOfTwo {
	
	public static boolean isPowOfTwo(int num) {
	    if(num == 1) return true;
	    int ans = 2;
	    while(ans < num) {
	        ans = ans * 2;
	    }
	    
	    if(ans == num) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
