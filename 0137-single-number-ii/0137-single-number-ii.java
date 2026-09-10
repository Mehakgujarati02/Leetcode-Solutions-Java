class Solution {
    public int singleNumber(int[] nums) {
      /*  HashMap<Integer, Integer> freq= new HashMap<>();
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
}tc :- O(n) and sc:- O(n) 
*/

//trying to solve it using bit manipulation to optimize it further
    //ones stores bits that have appeared exactly once so far, and twos stores bits that have appeared exactly twice so far.
        int ones= 0;
        int twos= 0;

        for(int i=0;i<nums.length;i++){
            ones=((nums[i]^ones) & (~(twos)));
            twos=((nums[i]^twos) & (~(ones)));
        }
        return ones;

    }    
}// tc:- O(n) and sc:- O(1)