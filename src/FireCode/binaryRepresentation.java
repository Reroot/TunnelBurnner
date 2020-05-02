package FireCode;

public class binaryRepresentation {
	public int binaryRepresentation(int val) {
		if(val < 2) {
			System.out.println(val);
			//Integer.
		}
		return binaryRepresentation(val/2) + binaryRepresentation(val%2);
	}
	public static void main(String[] args) {
		
	}
}
//27	26	25	24	23	22	21	20
//1		1	0	0	1	0	1	1
//
//That equates to 27 + 26 + 23+21 + 20 = 
///	128 + 64 + 8 + 2 + 1 = 203.
//Quotient	 	Remainder	 
//20310 ÷ 2 =	101	1	 
//10110 ÷ 2 =	50	1	↑
//5010 ÷ 2 =	25	0	↑
//2510 ÷ 2 =	12	1	↑
//1210 ÷ 2 =	6	0	↑
//610 ÷ 2 =	3	0	↑
//310 ÷ 2 =	1	1	↑
//110 ÷ 2 =	0	1	↑