class Solution {
    public int maxSubArray(int[] nums) {
        int max= Integer.MIN_VALUE; 
        int sum=0;
        for(int r=0; r< nums.length; r++){
            sum+= nums[r];
            max= Math.max(max, sum);

            if(sum <0) sum=0;  
        }
        return max;
    }
}//tc :- O(n) and sc :- O(1)