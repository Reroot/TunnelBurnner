package Strings;

class isPalindromeNum {
    public boolean isPalindromeNum(int x) {
        String s = Integer.toString(x);
        int start = 0;
        int end = s.length() -1;
        while(start <= end) {
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeRevMethod(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}