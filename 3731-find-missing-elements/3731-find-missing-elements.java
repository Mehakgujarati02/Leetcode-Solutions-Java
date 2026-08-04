class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {

            int curr = nums[i];
            int next = nums[i + 1];

            for (int x = curr + 1; x < next; x++) {
                ans.add(x);
            }
        }

        return ans;
    }
}//tc:- O(nlogn +x) here x is the number of missing element ,sc:- O(1)
