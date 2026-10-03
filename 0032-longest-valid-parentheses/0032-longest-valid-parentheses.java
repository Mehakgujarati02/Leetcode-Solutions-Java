class Solution {
    public int longestValidParentheses(String s) {
    Stack<Integer> stack = new Stack<>();
    stack.push(-1);//Think of -1 as a dummy boundary immediately before the string starts.

    int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {

            stack.pop();

            if (stack.isEmpty()) {
                stack.push(i);
            } else{
                max = Math.max(max, i - stack.peek());//eg= 3- (-1)= 4
                }
            }
        }
        return max;
    }
}