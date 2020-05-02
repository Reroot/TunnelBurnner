package FireCode;

public class findMissingNumberInASetOfNumberOnetoTen {
	public static int findMissingNumber(int[] arr) {
	    //intuation1 = sort and count with a for loop that counts, until a missing number apears
	    //intuation2 = add all numbers from 1 to 10, and subtract that against what we have
	    int norm = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
	    int test = 0;
	    for(int i = 0;i<arr.length;i++) {
	        test = test + arr[i];
	    }
	    
	    return norm - test;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
