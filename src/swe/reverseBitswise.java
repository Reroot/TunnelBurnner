package swe;

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
}
