class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freq= new HashMap<>();
        for(int i= 0; i< nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+ 1);
        }//here we got the freq map, so we now know which element appears how much time

        //now will use entry set to travers ethe entire hashmap to find out the values and key
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();

            }
        }
        return 0;
    }
}//tc :- O(n) and sc:- O(n)