package Math;

public class overLappingRectangles {
	// function to find intersection  
	// rectangle of given two rectangles. 
	static void FindPoints(int x1, int y1,  
	                       int x2, int y2, 
	                       int x3, int y3,  
	                       int x4, int y4) 
	{ 
	    // gives bottom-left point 
	    // of intersection rectangle 
	    int x5 = Math.max(x1, x3); 
	    int y5 = Math.max(y1, y3); 
	  
	    // gives top-right point 
	    // of intersection rectangle 
	    int x6 = Math.min(x2, x4); 
	    int y6 = Math.min(y2, y4); 
	  
	    // no intersection 
	    if (x5 > x6 || y5 > y6)  
	    { 
	        System.out.println("No intersection"); 
	        return; 
	    } 
	  
	    System.out.print("(" + x5 + ", " + 
	                           y5 + ") "); 
	  
	    System.out.print("(" + x6 + ", " +  
	                           y6 + ") "); 
	  
	    // gives top-left point 
	    // of intersection rectangle 
	    int x7 = x5; 
	    int y7 = y6; 
	  
	    System.out.print("(" + x7 + ", " +  
	                           y7 + ") "); 
	  
	    // gives bottom-right point 
	    // of intersection rectangle 
	    int x8 = x6; 
	    int y8 = y5; 
	  
	    System.out.print("(" + x8 + ", " +  
	                           y8 + ") "); 
	} 
	  
	// Driver code 
	public static void main(String args[]) 
	{ 
	    // bottom-left and top-right 
	    // corners of first rectangle 
	    int x1 = 0, y1 = 0,  
	        x2 = 10, y2 = 8; 
	  
	    // bottom-left and top-right 
	    // corners of first rectangle 
	    int x3 = 2, y3 = 3,  
	        x4 = 7, y4 = 9; 
	  
	    // function call 
	    FindPoints(x1, y1, x2, y2,  
	               x3, y3, x4, y4); 
	} 
}
//Given coordinates of 4 points, bottom-left and top-right corners of two rectangles. The task is to find the coordinates of the intersecting rectangle formed by the given two rectangles.
//
//
//
//Examples:
//
//Input:
//rec1: bottom-left(0, 0), top-right(10, 8),
//rec2: bottom-left(2, 3), top-right(7, 9)
//Output: (2, 3) (7, 8) (2, 8) (7, 3)
//
//
//
//Input:
//rec1: bottom-left(0, 0), top-right(3, 3),
//rec2: bottom-left(1, 1), top-right(2, 2)
//Output: (1, 1) (2, 2) (1, 2) (2, 1)
//
//Approach :
//As two given points are diagonals of a rectangle. so, x1 < x2, y1 < y2. similarly x3 < x4, y3 < y4.
//so, bottom-left and top-right points of intersection rectangle can be found by using formula.
//
//x5 = max(x1, x3);
//y5 = max(y1, y3);
//x6 = min(x2, x4);
//y6 = min(y2, y4);  
//In case of no intersection, x5 and y5 will always exceed x6 and y5 respectively. The other two points of the rectangle can be found by using simple geometry.