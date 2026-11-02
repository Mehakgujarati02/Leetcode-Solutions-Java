class Solution {
    public int minMoves2(int[] nums) {
        int n= nums.length;
        int ans= 0;

        //to get the nearest to all the elements calculating median is preferable, for that we do sorting in asc and then finding the middle value

        Arrays.sort(nums);
        int midi= nums[n/ 2];

        for(int i =0; i< n; i++){
            if(nums[i] < midi ){
                ans += midi- nums[i];
            }else{
                ans += nums[i]- midi;
            }
        }

        return ans;
    }
}