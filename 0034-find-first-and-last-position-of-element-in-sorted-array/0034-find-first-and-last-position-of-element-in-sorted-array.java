class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        int start= search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
         int mid = start + (end-start)/2;

            if(target < nums[mid]){
                end = mid -1;
            } else if(target > nums[mid]){
                start = mid+ 1;
            } else {
                /*If target == nums[mid], store mid as a potential
                 answer (ans = mid) and:

If findStartIndex is true, keep searching left (end = mid - 1) to 
find an earlier occurrence.

If findStartIndex is false, keep searching right (start = mid + 1) to 
find a later occurrence. */
                ans = mid;
                if(findStartIndex){
                    end = mid-1; 
                } else{
                    start = mid+1; 
                }

            }
        }
        return ans;
    }
}