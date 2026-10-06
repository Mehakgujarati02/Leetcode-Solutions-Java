class Solution {
    public int minAddToMakeValid(String s) {
        //using stack here(parenthesis= stack)
        Stack<Character> stack= new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                } else{
                    stack.push(ch);
                }
            }     else{
                    stack.push(ch);
                }
        }
        return stack.size();
    }
}//tc:- O(n), sc:- O(n)