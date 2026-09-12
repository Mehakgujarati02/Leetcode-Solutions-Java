class Solution {
    public int longestConsecutive(int[] nums) {
       
        HashSet<Integer> set= new HashSet<>();
        int maxLen= 0;
        for(int num: nums){
           set.add(num);//put everything in a hashset
        }
       
        for(int num : set){//num= 1
           if(!set.contains(num-1)){ //making sure we r starting from beginning
                int curLen= num;
                int len=1;
                while(set.contains(curLen +1)){
                   curLen++;
                   len++;
                }
               maxLen= Math.max(maxLen , len);
            }
        }
       return maxLen;
    }
}//tc:- O(n) and sc:- O(n)