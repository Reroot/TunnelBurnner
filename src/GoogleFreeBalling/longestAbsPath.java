package GoogleFreeBalling;

import java.util.HashMap;

public class longestAbsPath {
    public static int lengthLongestPath2(String input) {//using run 1 as ex
        char[] str = input.toCharArray();
        for(char c : str) {
        	System.out.print(c);
        }
        System.out.println("");
        System.out.println("");
        
        System.out.println("[file2.ext as the most 3 tabs to get to it]");
        System.out.println("");
        String[] parts = input.split("\n");
        HashMap<Integer, Integer> mapLevel = new HashMap<Integer, Integer>();//@level, count at level - use to retore and contuine count
        //level , length
        int maxLen = 0;
        for(String part : parts) {
            int level = part.lastIndexOf("\t") + 1;//0,1,2,2,
            System.out.print("level as current tab as depth -");
            System.out.print(level);
            System.out.print("-");
            int len = part.length() - level;//subtract the tab levels, before we use add this part to our prevoius chain
            
            
//reduce of len = currentPartLength - it's tab spaces, 
            //then restore the length of all the sum from mapped prev len of all parts, and now add the add the new part to the length
            //-1 becuase we need the prev tabbedlengthpath, we already have the length of the new part. 
            if(level != 0) {//skip this initally, add the current level back, based on 
                // parent would be always at level - 1
                // add +1 to account for forward slash
                len = mapLevel.get(level - 1) + len + 1;//get {0:3}, Get the Last mapped level to contuine off of
            }
            mapLevel.put(level, len);// iter1@map{0:3}{1:11}{2:21} iter2@map
            System.out.print("-len-");
            System.out.print(len);
            System.out.print("--last index of (.) ");
            //hit at 7 and 8
            System.out.println(part.indexOf("."));
            if(part.indexOf(".") != -1) {//runs at 6 (\t\tfile.ext), index of default to -1
                maxLen = Math.max(maxLen, len);// will run for each file and save, 
                //the current len, if it runs again and find a longer update
                //it will distribute
            }
        }
        return maxLen;
    }
    
	public static void main(String[] args) {
//		The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:
		//System.out.println(lengthLongestPath2("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
//		 the longest absolute path is "dir/subdir2/subsubdir2/file2.ext", and its length is 32 (not including the double quotes)

		System.out.println(lengthLongestPath2("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));


	
	}

}
