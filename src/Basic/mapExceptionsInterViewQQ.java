package Basic;

import java.util.HashMap;
import java.util.Map;

public class mapExceptionsInterViewQQ {
	  private static Map<String,Integer> map;

	  public mapExceptionsInterViewQQ() {
	    map = new HashMap<>();
	    map.put("foo", 1);
	    map.put("bar", 3);

	  }

	  public static int getValue(String input, int numRetries) throws Exception {
	    try {
	      return map.get(input);
	    } catch (Exception e) {
	      if (numRetries > 3) {
	        throw e;
	      }
	      return getValue(input, numRetries + 1);
	    }

	}
	  
	public static void main(String[] args) {
		try {
			System.out.println(getValue("foo", 0));
			System.out.println(getValue("bar", 1));
			System.out.println(getValue("baz", 1));
			System.out.println(getValue("fubar", 3));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}

}
