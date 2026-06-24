class Solution {
    public boolean rotateString(String s, String goal) {
        //we are given two strings s and goal, here to check if goal is the rotated string of s, we can create a string, s+s and using str.contains()check if str contains goal,
        if(s.length() != goal.length()){
            return false;
        }
        String str= s + s;
        if(str.contains(goal)){
            return true;
        }
        return false;
    }
}