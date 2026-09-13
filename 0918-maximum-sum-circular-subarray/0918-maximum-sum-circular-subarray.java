class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum= nums[0];
        int minSum= nums[0];

        int currMaxSum= nums[0];
        int currMinSum= nums[0];

        int totalSum= nums[0];

        for(int i= 1; i< nums.length; i++){
            //kadane's algo for max sum
            //either extend previous subarray or start a new one
            currMaxSum= Math.max(currMaxSum + nums[i], nums[i]);
            maxSum= Math.max(maxSum, currMaxSum);

            //Kadane's algo for min sum
            //either extend prev subarray or start a  new one
            currMinSum= Math.min(currMinSum + nums[i], nums[i]);
            minSum= Math.min(minSum, currMinSum);
            
            //calculate total sum
            totalSum+= nums[i]; 
        }

        //this is the circular sum minus the min subarray
        int circularSum= totalSum- minSum;

        //edge case: when all no are negative, maxSum will give -ve and circularsum will give 0 that is empty subarray, here we need to return max negative value
        if(circularSum== 0){
            return maxSum;
        }

        return Math.max(maxSum, circularSum);

    }
}