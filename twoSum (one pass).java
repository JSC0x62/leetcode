import java.util.HashMap;
/*
This solution uses the One Pass algorithim and is much faster at O(n) than brute force at O(n^2)

*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //0) use hashmap to store k = element value  v = index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //1) one pass implementation, iterate through nums[]
        for(int i = 0; i < nums.length; i++){
            //2) calculate the missing element to reach target
            int x = target - nums[i];
            
            //3) check if we have visited x
            if(map.containsKey(x)){
            //4) if we have visited x then we can return the indices values of num and x
                return new int[] {map.get(x), i};
            }
            
              //if not add the current value and its index to the map
                map.put(nums[i], i);
        }
        return nums;
    }
}
