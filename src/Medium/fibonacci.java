package Medium;

//Fibonacci Series using Recursion 
class fibonacci { 
	//recursive
	//T(n) = T(n-1) + T(n-2) + 1 = 2n = O(2^n)
	//O(n^2) Time Complexity: T(n) = T(n-1) + T(n-2) which is exponential.
	//Extra Space: O(n) if we consider the function call stack size, otherwise O(1).
	static int fib(int n) { 
		if (n <= 1) return n; 
		return fib(n-1) + fib(n-2); 
	} 
//iterative, with dynamic programing=> memoizations
// Time Complexity: O(n) , Space Complexity : O(n)
// Two major properties of Dynamic programming-
// To decide whether problem can be solved by applying Dynamic programming we check for two properties. If problem has these two properties then we can solve that problem using Dynamic programming.
// -Overlapping Sub-problems
// -Optimal Substructure.
	static int fibArr(int n) { 
		int fibs[] = new int[n+2]; 
		fibs[0] = 0;
		fibs[1] = 1;
		if (n <= 1) return n; 
		for(int i = 2;i<=n;i++) {
			fibs[i] = fibs[i-1] + fibs[i-2];
		}
		return fibs[n];
	} 
	
	public static void main (String args[]) { 
		int n = 6; 
		System.out.println(fib(n)); 
		System.out.println(fibArr(n)); 

	} 
} 
//                          fib(5)   
//                      /                \
//                fib(4)                fib(3)   
//              /        \              /       \ 
//          fib(3)      fib(2)         fib(2)   fib(1)
//         /    \       /    \        /      \
//   fib(2)   fib(1)  fib(1) fib(0) fib(1) fib(0)
//   /     \
// fib(1) fib(0)


// Solution 1: Iterative

// Time complexity: O(n)
// Space complexity: O(1)

// class Solution 
// {
//     public int fib(int N)
//     {
//         if(N <= 1)
//             return N;
        
// 		int a = 0, b = 1;
		
// 		while(N-- > 1)
// 		{
// 			int sum = a + b;
// 			a = b;
// 			b = sum;
// 		}
//         return b;
//     }
// }
// Solution 3: Dynamic Programming - Top Down Approach

// Time complexity: O(n)
// Space complexity: O(n)

// class Solution 
// {
//     int[] fib_cache = new int[31];
	
// 	public int fib(int N)
//     {
//         if(N <= 1)
//             return N;
//         else if(fib_cache[N] != 0)
//             return fib_cache[N];
// 		else 
//             return fib_cache[N] = fib(N - 1) + fib(N - 2);
//     }
// }

// import java.util.Scanner;

// /**
//  * The {@code FibonacciNumber} class represents a number generator to generate
//  * Fibonacci Number
//  * 
//  * @author Kanahaiya Gupta
//  */
// public class FibonacciNumber {

// 	// method1()-recursive solution
// 	// time complexity - O(2^n)
// 	public static int fibM1(int n) {
// 		if (n < 2)
// 			return n;
// 		return fibM1(n - 1) + fibM1(n - 2);

// 	}

// 	// method2()- Top down approach
// 	// time complexity - O(n)
// 	// space complexity - O(n)
// 	public static int fibM2(int n,int cache[]) {

// 		if (n < 2)
// 			return n;

// 		if (cache[n] != 0)
// 			return cache[n];

// 		return cache[n] = fibM2(n - 1,cache) + fibM2(n - 2,cache);

// 	}
		
	

// 	// method3()- Bottom up approach
// 	// time complexity - O(n)
// 	// space complexity - O(n)
// 	public static int fibM3(int n) {
// 		int cache[] = new int[n + 1];

// 		// base cases
// 		cache[0] = 0;
// 		cache[1] = 1;

// 		for (int i = 2; i <= n; i++)
// 			cache[i] = cache[i - 1] + cache[i - 2];

// 		return cache[n];

// 	}

// 	// method4()- most efficient solution
// 	// time complexity - O(n)
// 	// space complexity - O(1)
// 	public static int fibM4(int n) {
// 		int first = 0, second = 1, sum = 0;
// 		if (n < 2)
// 			return n;

// 		for (int i = 2; i <= n; i++) {
// 			sum = first + second;
// 			first = second;
// 			second = sum;
// 		}
// 		return sum;
// 	}

// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);
// 		int n = scanner.nextInt();
// 		method1(n);
// 		method2(n);
// 		method3(n);
// 		method4(n);
// 		scanner.close();
// 	}

// 	public static void method1(int n) {
// 		long startTime = 0, endTime = 0, executionTime = 0;
// 		startTime = System.nanoTime();
// 		System.out.println("fibM1 result:" + fibM1(n));
// 		endTime = System.nanoTime();
// 		executionTime = endTime - startTime;
// 		System.out.println("executionTime for fibM1() :" + executionTime);
// 	}

// 	public static void method2(int n) {
// 		long startTime = 0, endTime = 0, executionTime = 0;
// 		startTime = System.nanoTime();
// 		System.out.println("fibM2 result:" + fibM2(n,new int[n+1]));
// 		endTime = System.nanoTime();
// 		executionTime = endTime - startTime;
// 		System.out.println("executionTime for fibM2() :" + executionTime);
// 	}

// 	public static void method3(int n) {
// 		long startTime = 0, endTime = 0, executionTime = 0;
// 		startTime = System.nanoTime();
// 		System.out.println("fibM3 result:" + fibM3(n));
// 		endTime = System.nanoTime();
// 		executionTime = endTime - startTime;
// 		System.out.println("executionTime for fibM3() :" + executionTime);
// 	}

// 	public static void method4(int n) {
// 		long startTime = 0, endTime = 0, executionTime = 0;
// 		startTime = System.nanoTime();
// 		System.out.println("fibM4 result:" + fibM4(n));
// 		endTime = System.nanoTime();
// 		executionTime = endTime - startTime;
// 		System.out.println("executionTime for fibM4() :" + executionTime);
// 	}
// }
