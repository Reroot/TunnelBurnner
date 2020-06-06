package GoogleFreeBalling;

import java.util.HashMap;

public class longestAbsPath {
    public static int lengthLongestPath2(String input) {//using run 1 as ex
        String[] parts = input.split("\n");
        HashMap<Integer, Integer> mapLevel = new HashMap<Integer, Integer>();//@level, count at level - use to retore and contuine count
        //level , length
        int maxLen = 0;
        for(String part : parts) {
            int level = part.lastIndexOf("\t") + 1;//0 ts at part 1 + 1
            int len = part.length() - level;//3-1 = 2//iter1@len is 2
            if(level != 0) {//skip this initally
                // parent would be always at level - 1
                // add +1 to account for forward slash
                len = mapLevel.get(level - 1) + len + 1;//get {0:3}   
            }
            mapLevel.put(level, len);// iter1@map{0:3} iter2@map
            System.out.println(part.indexOf("."));
            if(part.indexOf(".") != -1) {//runs at 6 (\t\tfile.ext), index of default to -1
                maxLen = Math.max(maxLen, len);// will run for each file and save, 
                //the current len, if it runs again and find a longer update
                //it will distribute
            }
        }
        return maxLen;
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//wrong but logic is corrrect impelentation fail -- idk why it doesn't recoginze the "n" or /t"
    public static int lengthLongestPath(String input) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();//@level, count at level - use to retore and contuine count
        int curr = 0;
        int max = Integer.MIN_VALUE;
        char[] str = input.toCharArray();
        for(char c : str) {
        	System.out.print(c);
        }
    	//System.out.println(str.length);

        		//.split("n");
        int levelcount = 0;
  
        for(int i =0;i<str.length;i++) {
        	
            if(str[i] != '\t' || str[i] != ' ' || str[i] != '\n') {
            	levelcount = 0;
            	curr++;
            }
            
            max = Math.max(max, curr);//save the current max before we reset to the \t, so we have the update just incase we run into something smaller later

            if(str[i] == '\t') {
                levelcount++;
            } else {
                map.put(levelcount, curr);
                //restore
                //reset "/t" level count
            }    
            
            
            curr = map.getOrDefault(levelcount, curr); //get the curr at the level or insert it

            
        }
        return max;
    }
    
	public static void main(String[] args) {
//		The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:
		//System.out.println(lengthLongestPath2("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
//		 the longest absolute path is "dir/subdir2/subsubdir2/file2.ext", and its length is 32 (not including the double quotes)

		System.out.println(lengthLongestPath2("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));


	
	}

}
