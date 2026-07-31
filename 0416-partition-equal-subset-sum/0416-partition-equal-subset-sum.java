class Solution {
    public boolean canPartition(int[] nums) {
        int total= Arrays.stream(nums).sum();
        if(total % 2 != 0) return false;

        int targetSum= total / 2;
        boolean[] dp= new boolean[targetSum +1];
        dp[0] = true; //Using no elements,can always make sum 0

        for (int num : nums) {
            for (int currSum = targetSum; currSum >= num; currSum--) {
                dp[currSum] = dp[currSum] || dp[currSum - num];
                if (dp[targetSum]) return true;
            }
        }
        return dp[targetSum];
    }
}//tc:- O(n * targetSum) , sc:- O(targetSum)