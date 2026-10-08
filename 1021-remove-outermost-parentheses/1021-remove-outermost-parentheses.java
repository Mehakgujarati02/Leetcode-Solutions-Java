class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st= new Stack<>();
        StringBuilder res= new StringBuilder();//making a string builder to store the answer string

       /* When pushing '(' and stack is empty → don’t add it
          When popping ')' and stack becomes empty → don’t add it */

        for(char ch : s.toCharArray()){ //convert string to array
            if(ch == '('){
                if(!st.isEmpty()){
                    res.append(ch);//for outermost parentheses
                }
                st.push(ch);
            }else{
                st.pop();
                if(!st.isEmpty()){
                    res.append(ch);
                }
            }
        }
        return res.toString(); //convert stringbuilder to string
    }
}//tc:- O(n), sc:- O(2n)= O(n)