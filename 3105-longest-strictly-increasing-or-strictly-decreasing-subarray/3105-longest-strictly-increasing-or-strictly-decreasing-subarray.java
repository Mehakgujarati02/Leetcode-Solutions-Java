class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLen= 1;

        int inc= 1;
        int des= 1;

        for(int i= 0; i< nums.length-1; i++){
            if(nums[i]> nums[i+1] ){
                inc++;
                des= 1;
            }else if(nums[i]< nums[i+1]){
                des++;
                inc= 1;
            }else{
                inc= 1;
                des= 1;
            }
            maxLen= Math.max(maxLen, Math.max(inc, des));
        }
        return maxLen;
    }
}//tc:- O(n) and sc:- O(1)