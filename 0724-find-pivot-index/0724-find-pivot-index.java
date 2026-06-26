class Solution {
    public int pivotIndex(int[] nums) {
        int n= nums.length;
        int leftSum= 0;
        int rightSum= 0;

        //using prefix sum here, in this array we store the leftsum till that no.
        int[] prefixSum= new int[n];

        prefixSum[0]= nums[0];
        for(int i=1; i< n; i++){
            prefixSum[i]= prefixSum[i-1]+ nums[i];
        }//here we get the prefix sum array
        
        for(int i=0; i< n; i++){
            leftSum= prefixSum[i]- nums[i];
            //to find the rightsum we need total- leftsum- current index

            rightSum= prefixSum[n-1] -leftSum- nums[i];
            if(rightSum== leftSum){
                return i;
            }

        }
        return -1;
    }
}