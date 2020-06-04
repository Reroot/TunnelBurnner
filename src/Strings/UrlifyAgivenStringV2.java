package Strings;
/**
 * Given a String, replace every space with %20.Assume that there is sufficient space at the end of the string.
 * Approach 1: O(n^2)
 *  Start iterating the characters from 0 to n, if we encounter a space replace it with %20 by shifting the rest of the characters.
 * Approach 2: O(n)
 *  Start iterating n down to 0, (because the bottleneck in approach 1 was shifting chars each time) if we encounter a space replace with %20 or else the same char.
 *
 * Created by aravindhravindran on 6/6/17.
 */
public class UrlifyAgivenStringV2 {
    private final Character SPACE = ' ';
    public char[] urlify(char[] source, int actualLength){
        int startIndex = actualLength -1;
        int endIndex = source.length -1;
        for(; startIndex >=0; startIndex--){
            Character c = source[startIndex];
            if(c == SPACE){
                source[endIndex--] = '0';
                source[endIndex--] = '2';
                source[endIndex--] = '%';
            }else{
                source[endIndex--] = source[startIndex];
            }
        }
        return source;
    }
}