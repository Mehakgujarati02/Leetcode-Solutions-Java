class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> freq= new HashMap<>();
        int ans= 0;
        String word= "balloon";
        for(int i=0; i< word.length(); i++){//this loop is constant timed loop, only 7 times
            char ch= word.charAt(i);
            freq.put(ch, 0);
        }   

        for(int i=0; i< text.length(); i++){//here we store only 5 fixed size in hashmap:- b, a, l, o, n
            char c= text.charAt(i);
            if(freq.containsKey(c)){
                freq.put(c, freq.get(c)+ 1);
            }
            
        }    
        return Math.min( Math.min(freq.get('b'), freq.get('a')),Math.min(freq.get('n'),
        Math.min(freq.get('l') / 2, freq.get('o') / 2)));
    }
}//tc:- O(2n)= O(n), sc:- O(5)=O(1)