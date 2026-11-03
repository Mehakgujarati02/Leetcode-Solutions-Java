class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int x : nums) {
            max = Math.max(max, x);
        }
        int res = 0;
        for (int i : nums) {
            res += (max - i);
        }
        return res;
    }
}//tc:- O(n), O(1)    