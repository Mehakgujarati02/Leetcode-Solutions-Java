class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        //we only want to return two elements in the arr ao we can use two pointers here, keeping i at the first index and increasing i if sum is less then target and decreasing j if sum is more then target
        int left= 0;
        int right= n-1;

        while(left < right){
            int sum= numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left+1, right+1};//adding 1 because we r given a 1-indexed array in the question

            }else if(sum < target){
                left++;
            }else{
                right--;
            }
            
        }
        return new int[]{};
    }
}