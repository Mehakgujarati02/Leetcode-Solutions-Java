class Solution {
    public int maxProduct(int[] nums) {
        //here cant really use two pointers to calculate product as there are -ve elements also, so we'll use modified 
        int maxPro= nums[0];//here i keep min product and max product stored
        int minPro= nums[0];

        int ans= nums[0];

        for(int i= 1; i< nums.length; i++){
            int curr= nums[i];

            if(curr < 0){
                int temp= maxPro;
                maxPro= minPro;
                minPro= temp;

            }
            maxPro= Math.max(curr, maxPro* curr);
            minPro= Math.min(curr, minPro* curr);

            ans= Math.max(ans, maxPro );
        
        }
    
        return ans;
    }
}//tc:- O(n), sc:- O(1)