/*
https://leetcode.com/problems/maximum-product-subarray/submissions/
https://www.youtube.com/watch?v=lXVy6YWFcRM&ab_channel=NeetCode
*/

import java.lang.Math;
class Solution {
    public int maxProduct(int[] nums) {
        int min = 1;
        int max = 1;
        int tmp = 1;
        int result = nums[0];
        
        for(int i : nums){
            tmp = i * max;
            max = Math.max(i * max, Math.max(i * min, i));
            min = Math.min(tmp, Math.min(i * min, i));
            result = Math.max(result, max);
        }
        return result;
    }
}
