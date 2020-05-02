package DropBox;
// 122. Best Time to Buy and Sell Stock II
// Easy

// 1442

// 1477

// Favorite

// Share
// Say you have an array for which the ith element is the price of a given stock on day i.

// Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

// Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

// Example 1:

// Input: [7,1,5,3,6,4]
// Output: 7
// Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//              Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

//fixed with help
public class bestTimeToBuyAndSellStock { 
	
    public int maxProfitMulti(int[] prices) {
        //you buy and sell everytime if there's a diffrince, instead of checking for a max profit and having only one execution.
        int total = 0;
        for (int i=0; i< prices.length-1; i++) {
            if (prices[i+1]>prices[i]) total += prices[i+1]-prices[i];
        }
        
        return total;
    }
}





// //pure code draft;
// class Solution {
//     public int maxProfit(int[] prices) {
//         int maxTotal = 0;
//         int lastSell = 0;
//         for(int i = 0;i<prices.length;i++) {
            
//             maxTotal += runProfits(i, prices);
            
//         }
//         return maxTotal;
//     }
    
//     public int runProfits(int start,int[] prices) {
//         int currProfit = 0;
//         if(prices.length == 0) {
//             return 0;
//         }
//         int bought = prices[start];
//         //next for the looping
//         start = start + 1;
//         for(int i = start;i<prices.length;start++) {
//             if(bought < prices[start]) {
//                 if(currProfit < prices[start]-bought) {
//                     currProfit = prices[start]-bought; 
//                 }
//             } else {
//                 bought = prices[start]; //then the 
//             }
//         }
//         return currProfit;
//     }
// }