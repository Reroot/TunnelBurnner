package Math;

// Java program to demonstrate working of extended 
// Euclidean Algorithm
// Basic Euclidean Algorithm for GCD
// The algorithm is based on below facts.



// If we subtract smaller number from larger (we reduce larger number), GCD doesn’t change. So if we keep subtracting repeatedly the larger of two, we end up with GCD.
// Now instead of subtraction, if we divide smaller number, the algorithm stops when we find remainder 0.
// Below is a recursive function to evaluate gcd using Euclid’s algorithm. 

import java.util.*; 
import java.lang.*; 

class GCD 
{ 
	// extended Euclidean Algorithm 
	public static int gcd(int a, int b) 
	{ 
		if (a == 0) 
			return b; 
		
		return gcd(b%a, a); 
    } 
    
        // extended Euclidean Algorithm 
        public static int gcdExtended(int a, int b, int x, int y) 
        { 
            // Base Case 
            if (a == 0) 
            { 
                x = 0; 
                y = 1; 
                return b; 
            } 
      
            int x1=1, y1=1; // To store results of recursive call 
            int gcd = gcdExtended(b%a, a, x1, y1); 
      
            // Update x and y using results of recursive 
            // call 
            x = y1 - (b/a) * x1; 
            y = x1; 
      
            return gcd; 
        } 

// Driver Program 
	public static void main(String[] args) 
	{ 
		int a = 15, b = 10, g; 
		g = gcd(a, b); 
		System.out.println("GCD(" + a + " , " + b+ ") = " + g); 
		
		a = 35; b = 10; 
		g = gcd(a, b); 
		System.out.println("GCD(" + a + " , " + b+ ") = " + g); 
		
		a = 31; b = 2; 
		g = gcd(a, b); 
		System.out.println("GCD(" + a + " , " + b+ ") = " + g); 

	} 
} 
// Code Contributed by Mohit Gupta_OMG <(0_o)> 
