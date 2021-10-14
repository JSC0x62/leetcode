/*
https://leetcode.com/problems/maximum-subarray
This solution uses a sliding window-ish method, one pass through array
O(N)
*/
import java.util.ArrayList;
import java.lang.Math;
class Solution {
    public int maxSubArray(int[] nums) {
       //We need a base case, so the start of the max subarray is the first element
       //Its also possible we could end up with an input of only 1 element so we need this
       int maxSub = nums[0];
       //currentSum keeps track of the sum as we go through the array, and is compared to the max
       int currentSum = 0;
        for(int i = 0; i < nums.length; i++){
            //If the currentSum is < 0... We should discard that element and start over
            if(currentSum < 0){
                currentSum = 0;
            }
            //check the current element and add it to the sum
            //if the current sum is > than the max, the max should be updated
            currentSum += nums[i];
            maxSub = Math.max(maxSub, currentSum);
        }
        return maxSub;
    }
}
