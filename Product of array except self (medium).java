/*
https://leetcode.com/problems/product-of-array-except-self/submissions/
https://www.youtube.com/watch?v=bNvIQI2wAjk&ab_channel=NeetCode
O(n) solution. Passes through twice but nothing is nested so should still be n.

The general idea is that for each element we have to multiply everything except itself.
So you have a prefix and a postfix for each number.

*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
        int prefix = 1;
        int postfix = 1;
        for(int i = 0; i < nums.length; i++){
            output[i] = prefix;
            prefix *= nums[i];
        }
        for(int j = nums.length - 1; j >= 0; j--){
            output[j] *= postfix;
            postfix *= nums[j];
        }
        return output;
    }
}
