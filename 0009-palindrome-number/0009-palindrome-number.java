class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int reverse=0;
        int xcur= x;
        while(x>0){
            reverse= (reverse*10)+ (x%10);
            x/=10;
        }
        return reverse== xcur;
    }
}//tc:- d is the no of digits and here d= logx + 1 so we simply write the tc as O(log n) and  sc:- O(1)