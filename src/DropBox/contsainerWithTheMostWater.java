package DropBox;
public class contsainerWithTheMostWater {
    public int maxArea(int[] height) {
        int maxarea = 0;
        for (int i = 0; i < height.length; i++)
            for (int j = i + 1; j < height.length; j++)
                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
        return maxarea;
    }
}


// Time complexity : O(n^2)O(n 
// 2
//  ). Calculating area for all \dfrac{n(n-1)}{2} 
// 2
// n(n−1)
// ​	
//   height pairs.
// Space complexity : O(1)O(1). Constant extra space is used.

//class Solution {
//    public:
//        int maxArea(vector<int> &height) {
//            if (height.empty()) return 0;
//            int result = 0;
//            int l = 0;
//            int r = height.size() - 1;
//            while (l < r) {
//                int area = (r - l) * min(height[l], height[r]);
//                result = max(result, area);
//                if (height[l] < height[r]) {
//                    do {
//                        l++;
//                    } while (l < r && height[l-1] >= height[l]);
//                } else {
//                    do {
//                        r--;
//                    } while (r > l && height[r+1] >= height[r]);
//                }
//            }
//            return result;
//        }
//    };