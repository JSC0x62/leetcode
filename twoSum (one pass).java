import java.util.HashMap;
/*
This solution uses the One Pass algorithim and is much faster at O(n) than brute force at O(n^2)
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //one pass implementation
        for(int i = 0; i < nums.length; i++){
            //for each num in arr
            //we are looking for x: target - i = x
            //check if x is in the map
            int x = target - nums[i];
            if(map.containsKey(x)){
              //if x is here, we are done. Return it and i
                int[] result = new int[]{i, map.get(x)};
                return result;
            }
            else{
              //else we add this to our map to keep track of
                map.put(nums[i], i);
            }
            
        }
        return nums;
    }
}
