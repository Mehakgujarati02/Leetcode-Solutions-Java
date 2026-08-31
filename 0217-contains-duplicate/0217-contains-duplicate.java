class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*approach 1:-
        Arrays.sort(nums);
        int n = nums.length;
        for(int i =1; i <n; i++){
            if(nums[i] == nums[i-1]) return true; 
        }
        return false; */

        //approach 2:-
        HashSet<Integer> seenNumber= new HashSet<>();
        for(int num: nums){

            if(seenNumber.contains(num)){
                return true;
            }
            seenNumber.add(num);
        }
        return false;
    }
}//tc:- O(n), sc:- O(n)