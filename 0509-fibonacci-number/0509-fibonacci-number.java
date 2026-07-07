class Solution {
    /*int[] dp= new int[31];//as on the ques its given <=30 
    public int fib(int n) {

        if(n<= 1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n]= fib(n-1) + fib(n-2);
        
    return dp[n];
    } */

    //space optimizing it
    public int fib(int n){
        if(n <= 1){
            return n;
        }

        int prev2= 0;//F(0)
        int prev1= 1;//F(1)

        for(int i=2; i<= n; i++){
            int curr= prev1 + prev2;
            prev2= prev1;
            prev1= curr;
        }
        return prev1;
    }
}