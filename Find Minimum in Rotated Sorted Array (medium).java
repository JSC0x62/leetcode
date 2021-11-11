/*
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
This is my solution, it gets 0ms and is 100% faster than other results.
Its supposed to be a O log(n) solution, im not 100% sure if it meets that but is faster than a brute force approach. And obviously most other people's solutions (;
It uses a binary search of sorts.
*/

class Solution {
    public int findMin(int[] nums) {
        //Edge case: if there is only 1 element, just return that
        if(nums.length == 1){
            return nums[0];
        }
         //the 2 pointers used for the main loop. Just the start and end indexes of the array.
         int start = 0;
         int end = nums.length - 1;
         
         //Another edge case. Basically this case happens if the array is not rotated and is just normally sorted.
         if (nums[end] > nums[0]) {
            return nums[0];
        }
        
        //The main loop. Basically do this until the start and end approach each other
        //It may not really matter because the last return will never be reached anyway. The edge cases or the loop itself will find the result.
        while(start < end){
            //Basically what happens in the loop is: compare the current element from the start value, with its next element
            //If the next element is < the current... We want to return that one. 
            //Something called the "infliction point" is the point in in the array in which eveyrhting before it is decreasing, and everything after it is increasing
            //Its sort of the point in which the sorted array was "rotated"
            //So based on that the next element is the first (and lowest) increasing element which is our answer
            start++;
            end--;
            if(nums[start] < nums[start - 1]){
                return nums[start];
            }
            //However we are also searching from the end as well. The logic is basically the same... But its the end of the array so think of it in terms of that.
            //If the edge cases fail, one of these 2 if statments will find the result.
            if(nums[end] > nums[end + 1]){
                return nums[end + 1];
            }
         }
        
        return 0;
    }
}
