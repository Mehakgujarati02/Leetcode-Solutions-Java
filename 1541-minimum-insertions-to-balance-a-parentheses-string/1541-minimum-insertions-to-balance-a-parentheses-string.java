class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack= new Stack<>();
        int cnt= 0;

        for(int i=0; i< s.length(); i++){
            if(s.charAt(i) =='('){
                stack.push('(');
            } else{
                if(stack.isEmpty()){
                    //no '(' found
                    if(i!= s.length()-1 && s.charAt(i+1) == ')' ){
                    cnt++; //one insertion needed
                    i++; ////skip next ')'
                    }else{
                        cnt += 2; //need two insertions
                    }
                } else {
                    // Matching '(' found
                    if(i != s.length()-1 && s.charAt(i+1) == ')'){
                        stack.pop();
                        i++;
                    } else{
                        cnt++; //need one more ')'
                        stack.pop();
                    }
                }
            }
        }
        return cnt + stack.size() * 2; // Each 
    }
}//tc:- O(n) and sc:- O(n)