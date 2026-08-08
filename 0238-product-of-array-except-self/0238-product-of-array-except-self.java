class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] answer= new int[n];

        //product= left side of nos *rigth side of nos
        answer[0]= 1;
        for(int i=1; i< n; i++){
            answer[i]= answer[i-1] * nums[i-1]; 
        }

        int right= 1;
        for(int i= n-1; i>= 0; i--){
            answer[i]= answer[i] * right;
            right*= nums[i];
        }
        return answer;
    }
}//tc:- O(n), sc= O(1)