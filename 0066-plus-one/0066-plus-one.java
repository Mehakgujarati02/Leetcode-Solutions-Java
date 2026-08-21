class Solution {
    public int[] plusOne(int[] digits) {
        int n= digits.length;
        
        //int[] newDigits = new int[n + 1];
        for(int i= n-1; i>= 0;i--){
            if(digits[i] < 9){
                digits[i] += 1;
                return digits;
            }
            digits[i]=0;
        }
        digits= new int[n+1];
        digits[0] = 1;
        return digits;
    }
}//tc:- O(n) and auxilary sc:- O(1) and toatl sc:- O(n)