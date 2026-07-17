class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    
    public void backtrack(int[] nums, int index, List<Integer> curr ){
        // Every subset is a valid answer
        ans.add(new ArrayList<>(curr));

        for (int i = index; i < nums.length; i++) {

            // Skip duplicates elements
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            // Pick the element
            curr.add(nums[i]);
  
            // not pick the element
            backtrack(nums, i + 1, curr);

            // Backtrack
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>() );
        return ans;
    }
}