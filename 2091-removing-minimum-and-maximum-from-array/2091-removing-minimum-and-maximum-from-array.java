class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        // here we find indices of minimum and maximum
        for (int i = 0; i < n; i++) {

            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }

            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        int left = Math.min(minIndex, maxIndex) + 1;//here we get the min element
        int right = n - Math.max(minIndex, maxIndex);//here we get the max element index from behind

        int bothLeft = Math.max(minIndex, maxIndex) + 1;
        int bothRight = n - Math.min(minIndex, maxIndex);

        int oneLeftOneRight = left + right;

        return Math.min(bothLeft,
                Math.min(bothRight, oneLeftOneRight));
    }
}