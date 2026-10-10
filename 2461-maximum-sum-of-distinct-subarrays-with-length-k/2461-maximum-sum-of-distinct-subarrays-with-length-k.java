class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();//hashset for storing the unique elements
        int r = 0, l = 0;
        long sum = 0;
        long maxSum = 0;

        while(r < nums.length) {
            int i = nums[r];

            //Remove elements until i becomes unique, and then it return the distinct elements
            while(set.contains(i)) {
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }

            //Add current element
            set.add(i);
            sum += i;

            //Window size is k
            if(r - l + 1 == k) {
                maxSum = Math.max(maxSum, sum);

                //Move window forward,so here we have to remove the element thats num[l]
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            r++;
        }

        return maxSum;
    }
}//tc:- O(n), sc:- O(k) as only unique elements would be there