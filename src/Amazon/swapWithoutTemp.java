package Amazon;


public class swapWithoutTemp {
//	How to swap two numbers without using a temporary variable?
//			Given two variables, x and y, swap two variables without using a third variable.
//	
	//OR USE BIT XOR exculive to flip bits forward and back
//    int x = 10, y = 5; 
    // Code to swap 'x' (1010) and 'y' (0101) 
//    x = x ^ y; // x now becomes 15 (1111) 
//    y = x ^ y; // y becomes 10 (1010) 
//    x = x ^ y; // x becomes 5 (0101) 
	public static String swap(int a, int b) {
		int x = a + b;
		int y = x - b;//gets a
		int c = x - a;//get b

		return c + " " + y;
	}
	//OR
	  int x = 10, y = 5; 
	  
//	    // Code to swap 'x' and 'y' 
//	    x = x * y; // x now becomes 15 
//	    y = x / y; // y becomes 10 
//	    x = x / y; // x becomes 5 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(swap(3, 4));
	}

}
