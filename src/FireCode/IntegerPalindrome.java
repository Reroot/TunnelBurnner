package FireCode;
//Write a method that checks if a given integer is a palindrome - without allocating additional heap space
//Examples:
//-1 ==> false
//0 ==> true
//1221 ==> true

//The key here is to use % and / operators to reverse the input and then simply compare it with its original form

//1. Initialize a variable called num to the input.
//
//2. Iterate till num > 0.
//
//3. In each iteration, calculate the remainder as num % 10
//
//4. Reverse number as reverse = reverse * 10 + remainder.
//
//5. Decrement num as num/10.
//
//6. At the end of the loop, compare the reverse number with the input. If they match, return true else, false.

public class IntegerPalindrome {
	public static Boolean isIntPalindrome2(int x) { 
	    int num = x;//save the var can't just use x
	    int rev = 0;
	    while(num > 0) {
	        rev = rev*10 + num%10;//% for rem, 10* to multi the new remainder
	        num = num / 10;//cut the origonal num apart
	    }
	    return x == rev;
	}
	public static Boolean isIntPalindrome(int x) {            
	    int rev = 0;
	    if(x == 1) return true;
	    int rem = 0;
	    while(x > 0) {
	        rev = rev * 10 + rev % 10;
	        x = x / 10;
	    }
	    return rev==x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
