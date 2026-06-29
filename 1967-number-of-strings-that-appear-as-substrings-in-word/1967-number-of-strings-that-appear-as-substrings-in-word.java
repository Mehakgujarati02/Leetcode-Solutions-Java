class Solution {
    public int numOfStrings(String[] patterns, String word) {

        int n= patterns.length;
        int cnt= 0;
        for(int i= 0; i< n; i++){
            if(word.contains(patterns[i])){//using builtin string function to find the substring
                cnt++;
            }
        }

        return cnt;
    }
}