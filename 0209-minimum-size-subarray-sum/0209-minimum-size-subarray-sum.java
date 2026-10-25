class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int j= 0;
    int sum= 0;
    int min= Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];//find the overall sum of the array
    
        // using Sliding window to find the required subarray
        while(sum >= target) {
            min = Math.min(min, i - j + 1);
            sum -= nums[j]; //shrink the ponter to maintain window  
            j++;
        }
    }
       return min == Integer.MAX_VALUE ? 0 : min;//if subarray doesnt exist Integer.MAX_VALUE will be the answer
    }
}//tc:- O(n) and sc:- O(1)