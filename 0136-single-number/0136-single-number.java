class Solution {
    public int singleNumber(int[] nums) {
       /* HashMap<Integer, Integer> map= new HashMap<>();
        
        for(int num :nums){
            map.put(num, map.getOrDefault(num ,0) +1);
        }
        for(int num : nums){
            if(map.get(num) == 1){
            return num;
            }
        }    
        return -1; */
        int res=0;
        for(int i=0; i< nums.length ; i++){
            res= res ^ nums[i]; //we do XOR
            // 3^2^2^1^3 = (2^2)^(3^3)^1= 0^0^1= 1
        }
        return res;
    }
}