class Solution {
    public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    return nums[n/2];
    }
}
//n=3: majority appears >1.5 → 2+ times → occupies middle ✓
//n=5: majority appears >2.5 → 3+ times → middle 3 positions ✓  
//n=7: majority appears >3.5 → 4+ times → middle guaranteed ✓