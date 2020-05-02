package FireCode;

public class powerOf5 {
	public static boolean fivePow(int num) {
		int cur = num;
		if(num == 0) return false; 
		while(num % 5 == 0) {
			cur=cur/5;
		}
		return cur%5 == 1;
	}
//	Given a number, how do I check if it can be represented in 5^n form, while n is positive integer?
	public static void main(String[] args) {
		System.out.println(fivePow(1));
		
	}

}
