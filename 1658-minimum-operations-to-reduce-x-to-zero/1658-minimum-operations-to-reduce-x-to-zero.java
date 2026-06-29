class Solution {
    public int minOperations(int[] nums, int x) {
        int n= nums.length;
        //Finding the longest middle subarray whose sum is totalSum - x to get the min no of opr to reduce x to exactly 0

        int total= 0;
        for(int i=0; i< n; i++){
            total+= nums[i];
        }

        int target= total- x;//now this target should be equal to the sum

        //if target is negative then its impossible
        if(target < 0){
            return -1;
        }

        //if target is equal to 0 then need to remove all the elements
        if(target == 0){
            return n;
        }    

        //now will use sliding window+ two pointer to get the longest subarray
        int left= 0;
        int longLen= -1;
        int sum= 0;

        for(int right=0; right< n; right++){
            sum+= nums[right];

            while(sum > target){
                sum-= nums[left];//shrinking the window
                left++;
            }

            if(sum== target){
                longLen= Math.max(longLen, right- left+ 1);
            }
        }

        return longLen == -1? -1: n- longLen ;
    }
}