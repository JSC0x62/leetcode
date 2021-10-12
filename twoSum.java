/*
https://leetcode.com/problems/two-sum/
(my solution, very simillar to the defualt brute-force answer)
*/
class Solution {
    public int[] twoSumMySolution(int[] nums, int target) {
       //Start at the first element (i)
        for(int i = 0; i < nums.length; i++)
        {
            //from here, compare the next element (j) with i to see if they = target
            //if not, i is increased by 1 and we try again
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println(nums[i] + nums[j]);
                    int [] output = new int []{i, j};
                    return output;
                }
            }
        }
        System.out.println("Could not find valid result with the array: " + nums + "and target: "+ target);
        return nums;
    }
}
