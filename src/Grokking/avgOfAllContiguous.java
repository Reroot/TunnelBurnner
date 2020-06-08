package Grokking;

public class avgOfAllContiguous {
	
	// 1 brute solution
	// Math.avg or , sum of all k value / k, works sort of
	public static double[] contiguousBrutal(double[] a, double k) {
		// forEach(i+1 forEach(vaLinA()upToK)
		double[] avgrages = new double[(int) (a.length - k + 1)];
		double currSum = 0;
		if(a.length < k) k = (a.length%k);//to avoid crash as well
		//loop around
		for(double i=0;i<a.length - k;i++) {//subtract k to close the window, as we are shifting k at the end
			for(double j = i;j<i+k;j++) {//+i later?
				currSum = currSum + a[(int) j];
				System.out.println(currSum);
			}
			avgrages[(int) i] = currSum/k;
			System.out.println("avg: " + avgrages[(int) i]);
			//k need to shift too since it's a window
			//i started at zero, next it will shift a window + 1 with k
			//k++; //k started at 5, not it's at 6
			currSum = 0;//also reset current sum for next iter
		}
		return a;
	}
	
	
	
	
	

	public static void main(String[] args) {
		contiguousBrutal(new double[] {1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);
	}

}
//Given an array, find the average of all contiguous
//subarrays of size ‘K’ in it.
//
//Let’s understand this problem with a real input:
//
//Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
//Here, we are asked to find the average of all contiguous subarrays of size ‘5’ in the given array. Let’s solve this:
//
//For the first 5 numbers (subarray from index 0-4), the average is: (1+3+2+6-1)/5 => 2.2(1+3+2+6−1)/5=>2.2
//The average of next 5 numbers (subarray from index 1-5) is: (3+2+6-1+4)/5 => 2.8(3+2+6−1+4)/5=>2.8
//For the next 5 numbers (subarray from index 2-6), the average is: (2+6-1+4+1)/5 => 2.4(2+6−1+4+1)/5=>2.4
//…
//Here is the final output containing the averages of all contiguous subarrays of size 5:
//
//Output: [2.2, 2.8, 2.4, 3.6, 2.8]