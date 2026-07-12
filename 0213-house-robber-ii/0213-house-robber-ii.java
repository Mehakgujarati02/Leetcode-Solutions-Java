class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        
        //making two conditions ,one without last element and another without first, very similar to hiuse robber now
        if(n== 1){
            return nums[0];
        }
        if(n== 2){
            return Math.max(nums[0], nums[1]);
        }
        //no edge case check for n==3 as that could be duplicated code

        int prev2= nums[0];
        int prev1= Math.max(nums[0], nums[1]);

        //from 0 to n-2
        for(int i=2; i< n-1; i++){
            int curr= Math.max(prev2+ nums[i], prev1);
            prev2= prev1;
            prev1= curr;
        }

        int result= prev1;

        //from 1 to n-1
        prev2= nums[1];
        prev1= Math.max(nums[1], nums[2]);

        for(int i=3; i< n; i++){
            int curr= Math.max(prev2+ nums[i], prev1);
            prev2= prev1;
            prev1= curr;
        }

        return Math.max(result, prev1);
        
    }
} //tc:- O(n), sc:- O(1)