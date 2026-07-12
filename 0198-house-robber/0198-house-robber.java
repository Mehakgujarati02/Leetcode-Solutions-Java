class Solution {
    public int rob(int[] nums) {
    /*    int n= nums.length;
        int[] dp= new int[n];
        Arrays.fill(dp, -1);
        return f(n-1, nums, dp);
    }

    //using recursion, pick or not pick approach
    private int f(int ind, int[] nums, int[] dp){
        if(ind== 0) return nums[ind];
        if(ind <0) return 0; 

        if(dp[ind] != -1) return dp[ind];

        int pick= nums[ind]+ f(ind- 2, nums, dp);
        int notPick= 0+ f(ind-1, nums, dp);

        dp[ind]= Math.max(pick, notPick);
        return dp[ind];
    } */
    
    //using bottom up technique
    int n= nums.length;

    if(n == 1){
        return nums[0];
    }
    if(n== 2){
        return Math.max(nums[0], nums[1]);
    }

    int[] dp= new int[n];

    dp[0]= nums[0];
    dp[1]= Math.max(nums[0], nums[1]);

    for(int i= 2; i< n; i++){
        dp[i]= Math.max(nums[i]+ dp[i-2], dp[i-1]);
    }
    return dp[n-1];
    
    } 
}