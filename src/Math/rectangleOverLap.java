package Math;

import java.util.*;
// A rectangle is represented as a list [x1, y1, x2, y2], where (x1, y1) are the coordinates of its bottom-left corner, and (x2, y2) are the coordinates of its top-right corner.

// Two rectangles overlap if the area of their intersection is positive.  To be clear, two rectangles that only touch at the corner or edges do not overlap.

// Given two (axis-aligned) rectangles, return whether they overlap.

// Example 1:

// Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]
// Output: true
// Example 2:

// Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1]
// Output: false
// Notes:

// Both rectangles rec1 and rec2 are lists of 4 integers.
// All coordinates in rectangles will be between -10^9 and 10^9.
class rectanleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

                return (Math.min(rec1[2], rec2[2]) > Math.max(rec1[0], rec2[0]) && // width > 0
                        Math.min(rec1[3], rec2[3]) > Math.max(rec1[1], rec2[1]));  // height > 0
    }
}

// Approach #2: Check Area [Accepted]
// Intuition

// If the rectangles overlap, they have positive area. This area must be a rectangle where both dimensions are positive, since the boundaries of the intersection are axis aligned.

// Thus, we can reduce the problem to the one-dimensional problem of determining whether two line segments overlap.

// Algorithm

// Say the area of the intersection is width * height, where width is the intersection of the rectangles projected onto the x-axis, and height is the same for the y-axis. We want both quantities to be positive.

// The width is positive when min(rec1[2], rec2[2]) > max(rec1[0], rec2[0]), that is when the smaller of (the largest x-coordinates) is larger than the larger of (the smallest x-coordinates). The height is similar.