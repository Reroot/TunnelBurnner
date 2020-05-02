package FireCode;

public class powerOfNX {
	public static double powEZ(double x, int n) {

	    return Math.pow(x, n);
	}
	
	//my oringal
	public static double pow(double x, int n) {
        
		double result = 1;//start with 1
		int power = Math.abs(n);
		while(power > 0){
		    result = result*x;
		    power--;
		}

		return n >= 0 ? result : (1/result);

		}
}
