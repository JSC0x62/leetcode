/*
https://leetcode.com/problems/two-sum/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
First is my solution, then leetcode's. Both are brute force approaches.
*/
class Solution {
    public int[] twoSumMySolution(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++){
                //this is the main part that is different. The math should be the same.
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
    
    //leetcode solution
    public static int[] twoSum(int[] nums, int target) {
		//iterate through each element in the array
	    for (int i = 0; i < nums.length; i++) {
	    	//from there, iterate through the rest of the elements, compare to i
	    	//cant use the same elements, so it starts 1 higher than i
	        for (int j = i + 1; j < nums.length; j++) {
	        	//I used i + j = target, math should be the same here..
	        	//If it checks out, return a list with the elements that add to = target
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
