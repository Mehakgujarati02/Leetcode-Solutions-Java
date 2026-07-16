class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    //doing backtracking
    public void backtrack(int index, int[] nums, List<Integer> curr) {

        // Base Case
        if (index == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // Pick
        curr.add(nums[index]);
        backtrack(index + 1, nums, curr);

        // Backtrack
        curr.remove(curr.size() - 1);

        // Not Pick
        backtrack(index + 1, nums, curr);
    }

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0, nums, new ArrayList<>());
        return ans;
    }
}
// exploring all the subsets take O(2^ n), copying it into the ans takes O(n), hence total tc:- O(n * 2^n), total sc:- O(n * 2^ n)