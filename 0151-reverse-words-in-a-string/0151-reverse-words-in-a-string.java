class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        //trim():- removes leading and trailing spaces, not in between spaces
        //split() divides the string into parts.
        // \\s+ is a regular expression:
        // \\s → any whitespace (space, tab, newline)
        //  + → one or more times
        StringBuilder result = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {//here it adds the space between the words
                result.append(" ");
            }
        }
        
        return result.toString();//result is stringbuilder so we convert it back to string
    }
}