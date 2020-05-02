package Math;
/*
  The Bottom Up Approach
  This code passes all Leetcode test cases as of Jan. 10 2019
  Runtime: 31 ms
*/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CoinChangeBottomUp {

    public int coinChange(int[] coins, int amount) {
  
      // We use this to fill the dp table with default values
      int max = amount + 1;
  
      // This table will store the answer to our sub problems
      int[] dp = new int[amount + 1];
  
      // Initialize the dp table
      Arrays.fill(dp, max);  
  
      /*
        The answer to making change with minimum coins for 0
        will always be 0 coins no matter what the coins we are
        given are
      */
      dp[0] = 0;
  
      // Solve every subproblem from 1 to amount
      for (int i = 1; i <= amount; i++) {
        // For each coin we are given
        for (int j = 0; j < coins.length; j++) {
          // If it is less than or equal to the sub problem amount
          if (coins[j] <= i) {
            // Try it. See if it gives us a more optimal solution
            dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
          }
        }
      }
	return max;
    }
    
    // #Iterative Method:#
    // For the iterative solution, we think in bottom-up manner. Suppose we have already computed all the minimum counts up to sum, what would be the minimum count for sum+1?

    // Code in Java:


    public int coinChange4(int[] coins, int amount) {
        if(amount<1) return 0;
        int[] dp = new int[amount+1];
        int sum = 0;
        
    	while(++sum<=amount) {
    		int min = -1;
        	for(int coin : coins) {
        		if(sum >= coin && dp[sum-coin]!=-1) {
        			int temp = dp[sum-coin]+1;
                        if (min < 0 || temp < min) {
                        min = temp;
                        }
                    }
        	}
        	dp[sum] = min;
    	}
    	return dp[amount];
    }
    
 // #Recursive Method:#   The Top Down Approach
 // The idea is very classic dynamic programming: think of the last step we take. Suppose we have already found out the best way to sum up to amount a, then for the last step, we can choose any coin type which gives us a remainder r where r = a-coins[i] for all i's. For every remainder, go through exactly the same process as before until either the remainder is 0 or less than 0 (meaning not a valid solution). With this idea, the only remaining detail is to store the minimum number of coins needed to sum up to r so that we don't need to recompute it over and over again.
 // Code in Java:


 public int coinChange5(int[] coins, int amount) {
     if(amount<1) return 0;
     return helper(coins, amount, new int[amount]);
 }

 private int helper(int[] coins, int rem, int[] count) { // rem: remaining coins after the last step; count[rem]: minimum number of coins to sum up to rem
     if(rem<0) return -1; // not valid
     if(rem==0) return 0; // completed
     if(count[rem-1] != 0) return count[rem-1]; // already computed, so reuse
     int min = Integer.MAX_VALUE;
     for(int coin : coins) {
         int res = helper(coins, rem-coin, count);
         if(res>=0 && res < min)
             min = 1+res;
     }
     count[rem-1] = (min==Integer.MAX_VALUE) ? -1 : min;
     return count[rem-1];
 }


//BFS topdown

public int coinChange6(int[] coins, int amount) {
       if (amount == 0) {
           return 0;
       }

       Queue<Integer> queue = new LinkedList<>();
       boolean[] visited = new boolean[amount + 1];

       queue.offer(amount);
       visited[amount] = true;
       int currLevel = 1;

       while (!queue.isEmpty()) {
           int size = queue.size();
           System.out.println(queue);
           for (int i = 0; i < size; i++) {
               int curr = queue.poll();

               for (int coin : coins) {
                   int child = curr - coin;
                   if (child == 0) {
                       return currLevel;
                   } else if (child > 0 && !visited[child]) {
                       queue.add(child);
                       visited[child] = true;
                   }
               }
           }
           currLevel++;
       }
       return -1;
   }
}