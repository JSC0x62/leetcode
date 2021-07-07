class Solution {
    public int[] twoSumMySolution(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++)
        {
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
