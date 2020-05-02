package FireCode;

public class isThisIntegerAPalindrome {
//	Write a method that checks if a given integer is a palindrome - without allocating additional heap space
//	Examples:
//	-1 ==> false
//	0 ==> true
//	1221 ==> true
	public static Boolean isIntPalindrome(int x) {
		int f = x/2; //get the frontal , if 11, we can say that the front will be 1, as 
		//11/2 is 1
		//now get the end digit, as 11 % 2 = 1;
		int e = x%2;
		// in this ex we have f as 1 and e as 1, are they the same? yes so palindome;
		if(f == e) {
			return true;
		}
		return false;            
		// we can get the first digit, and the last digit
		// then comare them. 
		}
	//finished, revese and compaere 
	public static Boolean isIntPalindrome2(int x) {
		int num = x;
		int rev = 0;
		int rem = 0;
		while(num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;//the whole number, and it's cut by 10ths, 
			//what we need for a rev of a whole
		}
		return rev == x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
