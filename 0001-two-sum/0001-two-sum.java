class Solution {
    public int[] twoSum(int[] nums, int target) {
        //using hashmap to store the elements and then using .contains() to check if we have the required elements 
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i= 0; i< nums.length; i++){
            int found= target- nums[i];

            if(map.containsKey(found)){
                return new int[]{map.get(found), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}