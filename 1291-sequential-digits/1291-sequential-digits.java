class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ls= new ArrayList<>();

        String l= String.valueOf(low);//here coverted integer to string
        String h= String.valueOf(high);
        String s= "123456789";

        for(int i= l.length(); i<= h.length(); i++ ){ 
            for(int start= 0; start<= 9- i; start++ ){ //sliding window 
                int num= Integer.parseInt(s.substring(start, start+ i));//convert the substring to integer
                if(num >= low && num <= high ){
                    ls.add(num);
                }
            }
        }
        return ls;
    }
} //tc:- here since the string is of length 9, so maximum substring would be of 36:- O(1), sc:- O(1)