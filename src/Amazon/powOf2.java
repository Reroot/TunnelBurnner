package Amazon;

public class powOf2 {
    /*
     * checking if number is power of 2 using bit shift operator in java
     * e.g. 4 in binary format is "0000 0000 0000 0000 0000 0000 0000 0100";
     * and -4 is                  "1111 1111 1111 1111 1111 1111 1111 1100";
     * and 4&-4 will be           "0000 0000 0000 0000 0000 0000 0000 0100"
     */
    private static boolean isPowerOfTwoBest(int number) {
        if(number <0){
            throw new IllegalArgumentException("number: " + number);
        }
        if ((number & -number) == number) {
            return true;
        }
        return false;
    }


//Read more: https://javarevisited.blogspot.com/2013/05/how-to-check-if-integer-number-is-power-of-two-example.html#ixzz6JtxU8U7E
	public static boolean pow2(int x) {//8
		// the sqare of 2 is 1
		int count = x;
		while(count >= 1) {
			if(count == 1) {
				return true;
			}
			count = count / 2;
		}
//		if(count%2 == 0) {
//			return true;
//		} else {
//			return false;
//		}
		return false;

	}
	
	public static boolean pow4(int x) {//8
		// the sqare of 2 is 1
		int count = x;
		while(count >= 4) {
			if(count == 4) {
				return true;
			}
			count = count / 4;
		}
//		if(count%2 == 0) {
//			return true;
//		} else {
//			return false;
//		}
		return false;

	}
	public static void main(String[] args) {
		System.out.println(pow2(8));
		System.out.println(pow4(16));
		System.out.println(pow4(5));
	}

}
