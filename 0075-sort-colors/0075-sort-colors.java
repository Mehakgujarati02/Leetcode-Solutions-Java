class Solution {
    public void sortColors(int[] nums) {
        //using dutch national flag here
        int low =0, mid = 0, high= nums.length-1;
        while(mid <= high){//here O(n)
            
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1){
                mid++;
            } else{
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int first, int second){// swap tc is O(1)
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
} //toatl tc :- O(n), sc =O(1)