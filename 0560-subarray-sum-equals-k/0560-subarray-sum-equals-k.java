class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>(); //sum,freq
        map.put(0,1);// storing empty subarray in the map

        int ans=0;
        int sum=0;
        for(int j=0; j<nums.length; j++){
            sum+= nums[j];
            if(map.containsKey(sum-k)){//using prefix sum
                ans+=map.get(sum-k);
            }
 
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);//storing freq of the sum in the map 
            }else{
                map.put(sum, 1);//if not stored in the map, then storing the freq
            }
        }
        return ans;
    }
}//If current prefix sum is sum, then any previous prefix sum equal to sum-k forms a subarray with sum k. The HashMap stores frequencies of previous prefix sums so we can count all such subarrays in O(n) time, and sc:- O(n)