/*

This is an O(s+t) solution. Basically you put each string into a hashamp and count how many times each letter appears.
If the hasmaps are equal return true. If the strings dont have the same length or the hashmaps arent equal, return false.
https://www.youtube.com/watch?v=9UtInBqnCgA&ab_channel=NeetCode
https://leetcode.com/problems/valid-anagram/
*/
import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            sMap.merge(sChars[i], 1, Integer::sum);
            tMap.merge(tChars[i], 1, Integer::sum);
        }
        if(sMap.equals(tMap)){
            return true;
        }
        return false;
    }
}
