package Google;

public class optimizedPowerNM {
		 static double f=1;
		 static double p=1;
		// Optimized recursive solution to calculate pow(x, n)
			// using divide and conquer
			public static int power(int x, int n)
			{
				// base condition
				if (n == 0) {
					return 1;
				}

				// calculate sub-problem recursively
				int pow = power(x, n / 2);

				if ((n & 1) == 1) { // if y is odd
					return x * pow * pow;
				}

				// else y is even
				return pow * pow;
			}

	public static double optimizedPowerNM(int x, int n) {
		 double r;//bottom up
	    // Termination condition 
	    if (n == 0) 
	        return 1; 
	    // Recursive call 
	    r = optimizedPowerNM(x, n - 1); 
	    // Update the power of x 
	    p = p * x; 
	    // Factorial 
	    f = f * n; 
		return (r + p / f);
	}

    /* Function to calculate x raised to the power y */
    static int power3(int x, int y) 
    { 
        if (y == 0) 
            return 1; 
        else if (y % 2 == 0) 
            return power(x, y / 2) * power(x, y / 2); 
        else
            return x * power(x, y / 2) * power(x, y / 2); 
    } 
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(optimizedPowerNM(9,3));
        int x = 2; 
        int y = 3; 
  
        System.out.printf("%d", power(x, y)); 
	}

}
//The value of Exponential function can be calculated using Tailor Series.
//
//e^x = 1 + x/1! + x^2/2! + x^3/3! + ......
//To find its value using recursion, we will use static variables. 
//For the power of x we will use p and for factorial we will use f as static variables.
//The function shown below is used to increase the power of x.
//
//p = p*x 
//The function below is used to find factorial.
//f = f*n
//The function below is used to calculate the summation of the series.
//r+p/f