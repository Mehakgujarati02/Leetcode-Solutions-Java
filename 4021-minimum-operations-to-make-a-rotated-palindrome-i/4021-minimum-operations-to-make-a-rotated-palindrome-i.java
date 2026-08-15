class Solution {
    public int minOperations(String s) {
        int n= s.length();
        char[] arr= s.toCharArray();
        int min= Integer.MAX_VALUE;
        //we do left rotate the string and then increament any one  until we get a palindrome 
        
        for(int k= 0; k< n; k++){
            int cost= k; //here we store the cost of rotating
            for(int i= 0; i < n/ 2; i++){
                char c1 =arr[(k + i) % n];
                char c2 =arr[(k+ n- 1- i) % n]; 

                int d= (c2- c1+ 26)% 26;
                cost += Math.min(d, 26- d);
                if(cost >= min) break;
            }
            min= Math.min(min, cost);
        }
        return min;
    }
}//tc :- O(n^ 2) and sc:- O(n)