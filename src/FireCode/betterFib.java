package FireCode;

public class betterFib {
	public static int betterFibonacci(int n) {
	    int n1 = 1;
	    int n2 = 0;
	    int temp = 0;
	    if(n == 0) return 0;
	    if(n == 1) return 1;
	    
	    while(n > 1) {
	        temp = n1 + n2;
	        n2 = n1;
	        n1 = temp;
	        n--;
	    }
	    return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
