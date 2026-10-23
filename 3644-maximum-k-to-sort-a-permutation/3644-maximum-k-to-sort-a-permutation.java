class Solution {
    public int sortPermutation(int[] nums) {
        int ans = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                ans &= nums[i];//whichever places are misplaced are done bitwise AND operation with each other, 
            }
        }

        return Math.max(ans, 0);
    }
}//tc:- O(n) and sc:- O(n)