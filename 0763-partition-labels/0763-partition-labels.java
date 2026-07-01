class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastOccur= new int[26];
        ArrayList<Integer> ls= new ArrayList<>();

        //here we get the last occurance of the character
        for(int i=0; i< s.length(); i++){
            lastOccur[s.charAt(i)- 'a']= i;
        }

        //now using two pointer
        int start= 0;
        int end= 0;
        for(int i=0; i< s.length(); i++){
            end= Math.max(end, lastOccur[s.charAt(i)- 'a']);

            if(i== end){//when i= end we know that the partition is ended
                ls.add(end- start+ 1);
                start= end +1 ;
            }
        }
        return ls;
    }
}