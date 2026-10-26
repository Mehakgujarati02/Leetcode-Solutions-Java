class Solution {
    public int longestConsecutive(int[] nums) {
        //doing brute approach rather than using hashset to optimize the sapce complexity
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int ans = 1;
        int max = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                // Ignoring the duplicate elements if exists
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                ans++;
            } else {
                ans = 1;
            }

            max = Math.max(ans, max);
        }

        return max;
    }
}