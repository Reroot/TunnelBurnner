package Basic;
//Reverse bits of a given 32 bits unsigned integer.
//
// 
//
//Example 1:
//
//Input: 00000010100101000001111010011100
//Output: 00111001011110000010100101000000
//Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.
//Example 2:
//
//Input: 11111111111111111111111111111101
//Output: 10111111111111111111111111111111
//Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 which its binary representation is 10111111111111111111111111111111.
// 
//

public class reverseBits {
    public int reverseBitsA(int n) {
        //create the binary as an array
        //reverse
        //convert to int
        int rev = n;
        int rem = 0;
        String s = "";
		return rem;
        
    }
    
	public static int binaryRepresentation(int val) {
		if(val < 2) {
			System.out.println(val);
			//Integer.
		}
		return binaryRepresentation(val/2) + binaryRepresentation(val%2);
	}
	
	public static void main(String[] args) {
		System.out.println(binaryRepresentation(43261596));
		System.out.println("hi");
	}

}
