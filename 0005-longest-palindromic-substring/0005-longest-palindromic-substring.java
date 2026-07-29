class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0){
            return "";
        }

        String maxLen= s.substring(0, 1);

        for(int i=0; i< s.length(); i++){
            String odd= expand(s, i, i); //odd length palindrome
            String even= expand(s, i, i+1); //even length palindrome

            if(odd.length() > maxLen.length()){
                maxLen= odd;
            }

            if(even.length() > maxLen.length()){
                maxLen= even;
            }

        }
        return maxLen;

    }
    private String expand(String s, int left, int right){
            while(left >= 0 && right < s.length() && s.charAt(left) ==
             s.charAt(right) ){
                left--;
                right++;
            }
            return s.substring(left+ 1, right );
        } 

}//tc:- O(n^2) as it expands for odd as well as even and sc:- O(n) because of substring method