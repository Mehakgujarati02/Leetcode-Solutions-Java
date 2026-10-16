class Solution {
    public void nextPermutation(int[] nums) { 
        int idx= -1;
        int n= nums.length;
        //trverse from right to left
        //intitialize i at last 2nd element
        for(int i=n-2; i>= 0; i--){
            if(nums[i]< nums[i+1]){
                idx= i;
                break;
            }
        }    
        if(idx==-1){
            reverse(nums, 0, n-1);
            return; 
        }
        
        for(int j= n-1; j>= 0; j--){
            if(nums[j] > nums[idx]){
                swap(nums, j, idx);
                break;
            }
        }
        reverse(nums, idx+1, n-1);
    }

    public void swap(int[] nums, int first, int second){
        int temp= nums[first];
        nums[first]= nums[second];
        nums[second]= temp;
    }
    
    public void reverse(int[] nums, int first, int second){
        while(first< second){
            swap(nums, first, second);
            first++;
            second--;
        }
    }
}