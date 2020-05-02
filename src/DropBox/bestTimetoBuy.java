package DropBox;

class bestTimetoBuy {
	//REPLICA
	public static int maxGain(int[] a) {
	    int p = 0;
	    int m = 0;
	    if(a.length == 0) return 0;
	    //1 oporation
	    int min = a[0];
	    for(int i = 1;i<a.length;i++) {
	        if(min < a[i]) {
	            //norm case
	            p = a[i] - min;
	            if(m <= p) {
	                m = p;
	            }
	        } else {
	            //op case, so set p to last gain
	            min = a[i];
	        }
	    }
	   
	    return m;

	}
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
                bought = prices[i];
            }
        }
        return profit;
    }
}


//var maxProfit = function(prices) {
//	var min = Number.MAX_SAFE_INTEGER;
//	var max = 0;
//	for (var i = 0; i < prices.length; i++) {
//		min = Math.min(min, prices[i]);
//		max = Math.max(max, prices[i] - min);
//	}
//	return max;
//};

//def(self, prices) {
// low = 1000;
// profit = 0;
// for(i in prices)
//     low = Math.min(low, prices[i])
//     profit = Math.max(profit, prices[i]-low)
// profit
//}

//public int maxProfit(int[] stock) {
// int maxProfit = Integer.MAX;
// int minE = 0;
// //
// for(int i=0;i<stock.length;i++) {
//             if(minE < stock[i+1]) { //try to sell
//                 minE = Math.min(minE, stock[i]);
//                 maxProfit = Math.max(maxProfit, stock[i]-minE);  //0, // curr =1  //3,cuu=3
//                 }
// }
// return maxProfit;

//}