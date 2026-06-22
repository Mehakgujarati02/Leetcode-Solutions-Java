class Solution {
    public int maxProfit(int[] prices) {
        int profit= 0;

        for(int i= 1; i< prices.length; i++){
            if(prices[i] > prices[i-1]){
               profit+= prices[i] -prices[i-1];//here we will store the diff in profit variable
            } 
        }
        return profit;
    }
}//tc:- O(n), sc:- O(1)