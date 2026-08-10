class Solution {
    public int numDecodings(String s) {
       /*Decode position i:
        - take 1 digit
        - take 2 digits */
        int n= s.length();

        int[] dp= new int[n+1];

        //bases cases
        dp[0]= 1;//here for empty string there is one way to decode it
        dp[1]= s.charAt(0) == '0' ? 0 : 1;

        for(int i= 2; i<= n; i++){
            //one digit
            if(s.charAt(i-1) != '0'){
                dp[i] += dp[i-1];
            }

            //two digit 
            int num= Integer.parseInt(s.substring(i-2, i));

            if(num >= 10 && num <= 26){
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    } 
}