/*
https://leetcode.com/problems/product-of-array-except-self/submissions/
https://www.youtube.com/watch?v=bNvIQI2wAjk&ab_channel=NeetCode
O(n) solution. Passes through twice but nothing is nested so should still be n.

The general idea is that for each element we have to multiply everything except itself.
So you have a prefix and a postfix for each number.

Example:

nums = [1,2,3,4]

prefix loop:

1) i = 0, output[0] = prefix (1), 
prefix = nums[0] (1) * prefix (1), (prefix = 1)
[1,,,] //tecnically this happens on the first line but im just showing the result after each time through the loop

2) i = 1, output[1] = prefix (1)
prefix = nums[1] (2) * prefix (1), (prefix = 2)
[1,1,,]

3) i = 2, output[2] = prefix (2)
prefix = nums[2] (3) * prefix (2), (prefix = 6)
[1,1,2,]

4) i = 3, output[3] = prefix (6)
prefix = nums[3] (4) * prefix (6), (prefix = 24) //this doesnt matter
[1,1,2,6]

Postfix loop:

1) j = 3, output[3] = output[3] (6) * postfix (1) = 6, (output[3] = 6)
postfix = postfix (1) * nums[4] = 4, (postfix = 4)
[1,1,2,6]

2) j = 2, output[2] = output[2] (2) * postfix (4) = 8, (output[2] = 8)
postfix = postfix (4) * nums[2] (3) * postfix (4) = 12, (postfix = 12)
[1,1,8,6]

3) j = 1, output[1] = output[1] (1) * postfix (12) = 12, (output[1] = 12)
postfix = postfix (12) * nums[1] (2) * postfix (12) = 24, (postfix = 24)
[1,12,8,6]

4) j = 0, output[0] (1) * postfix (24) = 24, (output[0] = 24)
//we are done now..
Final result (this is returned) [24,12,8,6]

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
