package Grokking;

public class avgOfAllContiguous_SeriesOneSlidingWindow {
	
	public static double[] contiguousOptimized(double[] a, int k) {
		double[] avg = new double[(a.length - k + 1)];
		double windowSum = 0;
		int windowStart = 0;
		for(int windowEnd = 0;windowEnd<a.length;windowEnd++) {
			windowSum = windowSum + a[windowEnd] ;
			if(windowEnd >= k - 1) {//when the window is filled and ready
				avg[windowStart] = windowSum / k;				//we calculate avg when we fill our window
				windowSum = windowSum - a[windowStart];				//System.out.println(avg[windowStart]);

				windowStart++;
			}
		}
		return avg;
	}

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
//Time complexity: Since for every element of the input array, we are 
//calculating the sum of its next ‘K’ elements, the time 
//complexity of the above algorithm will be O(N*K) 
	
//  Brute O(N∗K) where ‘N’ is the number of elements in the input array.
//	Can we find a better solution? 
	//Do you see any inefficiency in the above approach?
//	The inefficiency is that for any two consecutive 
//  subArrays of size ‘5’, the overlapping part (which will contain four elements) will be evaluated twice. For example, take the above-mentioned input:

//we can try to not have to calc over and over again,
//but instead subtract A[j-1] from the curr sum
//so first value sumValueSum
//- a[i+1] + a[k]//last element of k
//so we will have the 3+2+6-1 PreCalculated, then we can
// add +a[K], now we dont have to iterate K-2 Elements
	
	public static void main(String[] args) {
		//contiguousBrutal(new double[] {1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);
		contiguousOptimized(new double[] {1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);

	}

}
//Given an array, find the average of all contiguous
//subArrays of size ‘K’ in it.
//Let’s understand this problem with a real input:
//Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
//Here, we are asked to find the average of all contiguous subarrays of size ‘5’ in the given array. Let’s solve this:
//
//For the first 5 numbers (subArray from index 0-4), the average is: (1+3+2+6-1)/5 => 2.2(1+3+2+6−1)/5=>2.2
//The average of next 5 numbers (subArray from index 1-5) is: (3+2+6-1+4)/5 => 2.8(3+2+6−1+4)/5=>2.8
//For the next 5 numbers (subArray from index 2-6), the average is: (2+6-1+4+1)/5 => 2.4(2+6−1+4+1)/5=>2.4
//…
//Here is the final output containing the averages of all contiguous subarrays of size 5:
//
//Output: [2.2, 2.8, 2.4, 3.6, 2.8]