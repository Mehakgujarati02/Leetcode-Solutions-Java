class Solution {
    public int climbStairs(int n) {
        //method 1:- doing it by recusrion, but tc there is O(2 ^n) as here 1 fn is calculated again and again
        //method 2:- solvin it using dp, bottom up approach, here can only climb 1 or 2 steps

        /*class Solution {

        int[] dp;

        public int climbStairs(int n) {
            dp = new int[n + 1];
            Arrays.fill(dp, -1);
            return solve(n);
        }

        private int solve(int n) {

        // Base cases
        if (n == 0 || n == 1)
            return 1;

        // Already computed
        if (dp[n] != -1)
            return dp[n];

        // Store and return
        dp[n] = solve(n - 1) + solve(n - 2);

        return dp[n];
    }
}  */
        
        //method 3:- tabulation, bottom up approach dp using for loop:- tc and sc :-O(n)
        //base cases
        if(n <= 2){
            return n;
        }
        
        int[] dp= new int[n+1];
        dp[1]= 1;
        dp[2]= 2;

        for(int i=3; i<= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n]; 

        //method 4:- doing space optimizaton, using prev1, prev2 pointers where cur= dp[i-1]+dp[i-2]
    }
}