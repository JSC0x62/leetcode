/*
https://leetcode.com/problems/valid-palindrome/submissions/
https://www.youtube.com/watch?v=jJXJ16kPFWg&ab_channel=NeetCode

O(n) solution. Avoids using built in java methods to demonstrate core idea of the problem.
Uses a 2 pointer solution.

An example is Ta$Co*cat
First its gets converted to lowercase: ta$co*cat
Next it becomes a char array ['t','a','$','c','o','*','c','a','t']


1) l = t, r = t
2) l = a, r = a
3) l = $ (l++) l = c, r = c
4) l = 'o', r = * (r++) r = o

They both meet in the middle at o. Notice how each pass they are always the same character even if they hit a invalid one.

*/
import java.util.Arrays;
class Solution {
    public boolean isPalindrome(String s) {
      //Initial setup. Can't operate on strings in java so a char[] is used. The string is converted to lowercase first.
      //l starts at the start of the array and r is at the end.
      char[] sArray = s.toLowerCase().toCharArray();
        int l = 0;
        int r = sArray.length - 1;
        //Eventually l and r will meet. Operate until they do.
        while(l < r){
           //here we check and see if this is a valid character (a-z, no special characters or spaces etc)
           //increment until a valid char is reached
           while (l < r && isValidChar(sArray[l]) == false){
               l++;
           }
           //same as above but for the right pointer
           while(r > l && isValidChar(sArray[r]) == false){
                r--;
           }
           //if they aent the same character... Its not valid. Everytime a valid character is hit they should be the same Otherwise its not a plaindrome
            if(sArray[l] != sArray[r]){
                return false;
            }
            //after both hit a valid character, increment the left and decrease the right.
            l++;
            r--;
        }
        return true;
    }
    
    //this method checks to see if its in the alphabet or not. Also we have to check for 0-9 honestly not sure why.
    //it uses ASCII which is why its doing the cast to int so its saying ASCII value of c and 'A', etc.
    //may not actually need the cast to ints.
    //if valid return true, if not return false
    public boolean isValidChar(char c){
        boolean b = false;
        if( (int) c >= (int) 'A'  && (int) c  <=  (int) 'Z' ){
            return true;
        }
        if( (int) c >= (int) 'a'  && (int) c  <=  (int) 'z' ){
            return true;
        }
        if( (int) c >= (int) '0'  && (int) c  <=  (int) '9' ){
            return true;
        }
        return false;
        
    }
}
