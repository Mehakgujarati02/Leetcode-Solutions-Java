class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = 'z' - s.charAt(i) + 1;//as it is 1-indexed
            ans += value * (i + 1);
        }
        return ans;
    }
}//here tc:- O(n) and sc:- O(1)