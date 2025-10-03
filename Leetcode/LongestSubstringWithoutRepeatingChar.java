package Leetcode.Leetcode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
      String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
//        System.out.println(s.length());
//        System.out.println(s.charAt(1));
//        Hashtable<Character,Integer> hashtable = new Hashtable<>();
//        for (int i = 0 ; i<s.length();i++){
//            hashtable.put(s.charAt(i),i);
//        }
//        System.out.println(hashtable.containsKey('a'));
//        System.out.println(hashtable.get('d'));
    }
    public static int lengthOfLongestSubstring(String s) {
       int maxLength = 0 , length =0;
        Map<Character,Integer> hashtable = new HashMap<>();
        int l = 0 ,r = 0 ,n = s.length();
        while (r<n){
            if(hashtable.containsKey(s.charAt(r)) && hashtable.get(s.charAt(r))>=l){
                l = hashtable.get(s.charAt(r)) + 1;
            }
            else {
                hashtable.put(s.charAt(r) ,r);
                length = r -l +1;
                r++;
            }
            maxLength = Math.max(maxLength , length );

        }
        return maxLength;
    }
}
