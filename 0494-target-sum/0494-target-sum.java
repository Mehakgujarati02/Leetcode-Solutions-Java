class Solution {
    public int solve(int[] nums,int target,int currNum,int idx){

        //recursive solution
        if(currNum == target && idx == nums.length){
            return 1;
        }
        if(idx >= nums.length){
            return 0;
        }

        int addAns = solve(nums,target,currNum+nums[idx],idx+1);
        int subAns = solve(nums,target,currNum-nums[idx],idx+1);

        return addAns+subAns;

    }
    public int findTargetSumWays(int[] nums, int target) {
        int currNum =0;
        int ans = solve(nums,target,currNum,0);
        return ans;
    }
}// tc:- O(2^ n) and sc:- O(n) because of the recursion stack