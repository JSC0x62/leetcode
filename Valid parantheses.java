/*
  https://leetcode.com/problems/valid-parentheses/submissions/
  https://www.youtube.com/watch?v=WTzjTskDFMg&ab_channel=NeetCode
  
  This is a O(n) solution that uses a stack to solve.
*/
import java.util.Stack;
import java.util.HashMap;
class Solution {
    public boolean isValid(String s) {
        //Initial setup, need a charcater array and map the different types of closed parantheses to each other. And a stack.
        char[] chars = s.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        Stack<Character> stack = new Stack<>();
        //Main loop. Operate on each character
        for(char c : chars){
            //if the map contains the current character (in this case would be a closed parantheses)
            if(map.containsKey(c)){
                //if the stack isn't empty and the most recent value (LIFO) = the matching opening parantheses, pop that one off the stack
                if(! stack.isEmpty() && stack.peek() == map.get(c)){
                    stack.pop();
                }
                //if the stack is empty and we have a closed parantheses, this is invalid. Only open parantheses are added to the stack.
                //closed ones arent added, as we store the open ones, then if we hit a a closed one, check against what we have in the stack for a possible match
                //so something like '}' or '((]' is invalid.. also accounts for correct order
                //something like '[(]) will fail because current in stack '(' will not match the next closed one which is ']'
                else{
                    return false;
                }
            }
            //if its open push it on the stack
            else{
                stack.push(c);
            }
            
        }
        //At the end the stack should be emptied.    
        if(! stack.isEmpty()){
            return false;
        }
        return true;
    }
}
