package FireCode;

public class maxGain {
	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.
    public int maxProfit(int[] prices) {
        int profit = 0;
        if(prices.length == 0) {
            return profit;
        }
        int bought = prices[0];
        
        for(int i=1;i<prices.length;i++) {
            if(bought < prices[i]) { //if true then intial bought is less, so check our profit, and if our potential profit is greater, then update our profit, keep our buy. otherwis eif true, but our potential profit is less, then just keep the old profit- will be false so the for loop wont run. 
                //profit will be the diff of the smaller num
                if(profit < (prices[i] - bought)) {
                profit = prices[i] - bought;
                }
            } else { //means the prices at next is less, and we need to to buy for less
                //a[start] is greaters, so set the min to next
            	bought = prices[i];
            }
        }
        return profit;
    }
	public static int maxGain(int[] a) {
	    if(a.length == 0) return 0;
	    if(a.length == 1) {
	        if(a[0] < a[1]) {
	            return a[1] - a[0];
	        }
	    }
	    int curr = 0;
	    int max = a[0];

	    for(int i = 1;i<a.length;i++) {
	        if(curr < a[i]) {
	            max = a[i] - curr; //track the current max
	            if(max < (max - curr)) { //set max to newMax as it becomes the current max, if
	            //new max is updated update old max. 
	                max = curr; 
	            }
	        } else {
	        	curr = a[i];//curr is greater
	        } 
	    }
	    
	    return max;

	}
	

	// public int maxProfit(int[] stock) {
//	     int maxProfit = Integer.MAX;
//	     int minE = 0;
//	     //
//	     for(int i=0;i<stock.length;i++) {
//	                 if(minE < stock[i+1]) { //try to sell
//	                     minE = Math.min(minE, stock[i]);
//	                     maxProfit = Math.max(maxProfit, stock[i]-minE);  //0, // curr =1  //3,cuu=3
//	                     }
//	     }
//	     return maxProfit;
	// }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
