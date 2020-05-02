import java.util.Collections;
import java.util.HashMap;

class fruitIntoBaskets {
//     Java:
// Time O(N), Space O(N)

    public int totalFruit(int[] tree) {
        Map<Integer, Integer> count = new HashMap<>();
        int i = 0, j;
        for (j = 0; j < tree.length; ++j) {
            count.put(tree[j], count.getOrDefault(tree[j], 0) + 1);
            if (count.size() > 2) {
                count.put(tree[i], count.get(tree[i]) - 1);
                count.remove(tree[i++], 0);
            }
        }
        return j - i;
    }


// Input: [1,2,3,2,2]
// Output: 4
// Explanation: We can collect [2,3,2,2].
// If we started at the first tree, we would only collect [1, 2].
        public int totalFruit(int[] tree) {
            int start = 0;
            int n = tree.length;
            int maxLength = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int end = 0; end < n; end++) {
                map.put(tree[end], end);
                if (map.size() > 2) {
                    int minIndex = Collections.min(map.values());
                    map.remove(tree[minIndex]);
                    start = minIndex + 1;
                }
                maxLength = Math.max(maxLength, end - start + 1);
            }
            return maxLength;
        }

//     More Similar Sliding Window Problems
// Here are some similar sliding window problems.
// Also find more explanations.
// Good luck and have fun.

// Count Number of Nice Subarrays
// Replace the Substring for Balanced String
// Max Consecutive Ones III
// Binary Subarrays With Sum
// Subarrays with K Different Integers
// Fruit Into Baskets
// Shortest Subarray with Sum at Least K
// Minimum Size Subarray Sum





    public int totalFruit(int[] tree) {
        // track last two fruits seen
        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastFruitCount = 0;
        int currMax = 0;
        int max = 0;
        
        for (int fruit : tree) {
            if (fruit == lastFruit || fruit == secondLastFruit)
                currMax++;
            else
                currMax = lastFruitCount + 1; // last fruit + new fruit
            
            if (fruit == lastFruit)
                lastFruitCount++;
            else
                lastFruitCount = 1; 
            
            if (fruit != lastFruit) {
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }
            
            max = Math.max(max, currMax);
        }
        
        return max;
    }
}