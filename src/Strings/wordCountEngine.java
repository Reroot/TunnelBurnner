package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.*;

public class wordCountEngine {
    public static void main(String[] args) {
        System.out.println("hello");
        sortMap(wordCount("practice makes perfect. get perfect by practice. just practice!"));
    }
    
    static HashMap<String,Integer> wordCount(String s) {
        HashMap<String,Integer> answer = new HashMap<String,Integer>();
        
        String[] words = s.replace("!","").replace(".","").replace("?","").split(" ");
       for(int i=0; i< words.length; i++) {
           Integer c = answer.get(words[i]);
           if(c == null) c = 0;
           
           answer.put(words[i], c+1);
       }
        System.out.println(answer);
       return answer; 
    }
    
    static Map<String,Integer>  sortMap( Map<String,Integer> m) {
        List<Entry<String, Integer>> entries = new ArrayList<Entry<String, Integer>>(m.entrySet());
        Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
            
        return m;
    }
}
