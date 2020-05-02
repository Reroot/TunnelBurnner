package FireCode;

public class reverseInteger {
//	Java reverse an int value - Pseudocode:
//
//		Let's say number = 12345
//		a. Extract the rightmost digit of your input number. (12345 % 10) = 5
//
//		b. Take that digit (5) and add it into a new reversedNum.
//
//		c. Multiply reversedNum by 10 (5 * 10) = 50, this exposes a zero to the right of your (5).
//
//		d. Divide the input by 10, (removing the rightmost digit). (12345 / 10) = 1234
//
//		e. Repeat at step a with 1234
	public static int rev(int num) {//use the num
		int rev = 0;
		while(num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return rev;
	}
	
	public static int reverseInt3(int x) {
	    return reverseInt33(x, 0);
	}
	public static int reverseInt33(int x, int nx) {
	    if(x==0) return nx;//x acts a num
	    return reverseInt33(x/10, (nx*10)+x%10);
	}
	
	//fail on negative
	public static int reverseInt(int x) {
        int num = x;
        //int rem = 0;
        int rev = 0;
        while(num > 0) {//doesn't accept negatives
            rev = rev*10 + num%10;
            num = num / 10; //acts as rem and to break loop
        }
        return rev;
    
}
	
	public static void main(String[] args) {
		System.out.println(rev(100));
		rev(100);

	}

}
