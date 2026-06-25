class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        //using prefix sum and hashmap here
        HashMap<Integer, Integer> map= new HashMap<>();//Have I seen this remainder before? If yes, then everything between those two positions has a sum divisible by k.
        map.put(0, -1);

        int prefixSum= 0;
        for(int i=0; i< nums.length; i++){
            prefixSum +=nums[i];

            int rem= prefixSum % k; //will store the remainder in rem
            if(map.containsKey(rem)){
                if(i- map.get(rem) >= 2){
                    return true;
                }
            }else{
                map.put(rem, i);
            }
        }
        return false;
    }
}