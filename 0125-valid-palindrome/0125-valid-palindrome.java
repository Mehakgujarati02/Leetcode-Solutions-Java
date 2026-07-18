class Solution {
    public boolean isPalindrome(String s) {
        //using two pointers here
        int left= 0; 
        int right= s.length()-1;
        while(left <right){
            //for eliminating alphanumerics from left
            while(left <right && !Character.isLetterOrDigit(s.charAt(left))){
                left++; //skip that alphanumeric
            }
            //for eliminating alphanumerics from right
            while(left <right && !Character.isLetterOrDigit(s.charAt(right))){
                right--; //skip alphanumeric
            }

            if(Character.toLowerCase(s.charAt(left)) 
              !=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}//tc:- O(n), sc:- O(1)