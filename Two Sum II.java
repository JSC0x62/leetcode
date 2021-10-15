/*
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/
https://www.youtube.com/watch?v=cQ1Oz4ckceM&list=PLot-Xpze53lfQmTEztbgdp8ALEoydvnRQ&index=3&ab_channel=NeetCode

This is an O(N) solution that is sort of a sliding window method. It uses 2 pointers at the start and end of the array.
Since the array is sorted in ascending order, this can be taken advantage of. 
Its pretty simple, add the element the left and right pointer are pointing to in the array and see if this is = target.
If its < target, we need more, so increase the left.
If its > target we need less, so decrease the right.

*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        boolean notFound = true;
        //have to shift each of these up by 1 at the end
        while(notFound){
           int i = numbers[left] + numbers[right];
            System.out.println(i);
            if(i > target){
                right--;
            }
            else if(i < target){
                left++;
            }
            else{
                System.out.println(left);
                System.out.println(right);
                int[] result = new int[]{left + 1, right + 1,};
                return result;
            }
        }
        
            return numbers;
        }
}
