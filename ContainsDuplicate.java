/*
https://leetcode.com/problems/contains-duplicate/
My solution and their's. Neither are brute forced, im not sure what the complexity of mine is. Their's is O(N).
*/
import java.util.*;
class Solution {
    public boolean myContainsDuplicate(int[] nums) {
        //Basically the logic of this whole thing is to create a Set from the array, and check the difference afterwards. Sets can't have duplicates.
        //There may be an easier way to do this, but the general idea should be the same. This solution was above average in speed but uses a lot of resources.
        Set<Integer> nums_set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if(nums.length != nums_set.size()){
            return true;
        }
        return false;
    }
  
  public boolean containsDuplicate(int[] nums) {
    //im not sure why the length here is needed. Should be mutable...
    Set<Integer> set = new HashSet<>(nums.length);
    //for each int element in array nums:
    for (int x: nums) {
        //if the set has the element, we are done. If not, add it to the set and do it again for the next element.
        if (set.contains(x)) return true;
        set.add(x);
    
    }
    return false;
}
    
  /*
  A really simple O(N) solution. My first solution is faster but this one is simpler and still fast.
  */
  public boolean containsDuplicateSimple(int[] nums) {
       Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.add(i) == false){
                return true;
            }
        }
        return false;
    }
}
