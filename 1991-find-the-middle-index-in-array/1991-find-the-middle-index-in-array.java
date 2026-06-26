class Solution {
    public int findMiddleIndex(int[] nums) {
        //here instead of making a whole new prefix array we can do the question without doing so
        
        int total= 0, right= 0;
        for(int i=0; i< nums.length; i++){
            total+= nums[i];
        }

        int left= 0;
        for(int i=0; i< nums.length; i++){
           
            right= total- left- nums[i];//we can find the right sum by actually subtracting leftsum from total and then also substract current element
            if(right== left){
                return i;
            }
            left+= nums[i]; 
        }
        return -1;
    }
}//optimized sol:- tc= O(n), sc= O(1)