package Swe;

public class reverseBitswise {
	public int revbit(int n) {
		int output = 0;
		while(n != 0) {
			output = output << 1;//shift 1 left, until we iterate through n
			if((n & 1) == 1) {
				output = output | 1;
			}
			n = n >> 1;//knock off the least sig bit
		}
		return output;
	}
	
	public static int mask(int n) {
			n ^= 256;//mask
		return n ^= 256;//restore
	}
	
	
	
	public static void main(String[] args) {

		System.out.println(mask(110));
	}
}
