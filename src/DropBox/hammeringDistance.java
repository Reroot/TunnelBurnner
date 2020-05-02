package DropBox;

public class hammeringDistance {
	class hammeringDistance1 {
	    public int hammingDistance(int x, int y) {
	    	//xor is used to detect dat maniulation in packets
	        //convert to bin then, xor and count
	        return Integer.bitCount(x ^ y);
	    }
	}
	public static void main(String[] args) {
	    String str1 = "1010100101";
	    String str2 = "1110000101";
	    StringBuffer sb = new StringBuffer();
	    for (int i = 0; i < str1.length(); i++) {
	       sb.append(str1.charAt(i)^str2.charAt(i));
	    }
	    System.out.println(sb);
	}

}

//
//public class XORTest1 {
//	   public static void main(String[] args) {
//	      boolean x = false;
//	      boolean y = false;
//	      boolean xXorY = x ^ y;
//	      System.out.println("false XOR false: "+xXorY);
//	      x = false;
//	      y = true;
//	      xXorY = x ^ y;
//	      System.out.println("false XOR true: "+xXorY);
//	      x = true;
//	      y = false;
//	      xXorY = x ^ y;
//	      System.out.println("true XOR false: "+xXorY);
//	      x = true;
//	      y = true;
//	      xXorY = x ^ y;
//	      System.out.println("true XOR true: "+xXorY);
//	   }
//	}
//	Output
//	false XOR false: false
//	false XOR true: true
//	true XOR false: true
//	true XOR true: false