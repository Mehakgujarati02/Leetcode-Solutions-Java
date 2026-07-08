class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        ArrayList<Integer> ans= new ArrayList<>();

        int wordLen = words[0].length();
        int wordCount = words.length;

        if(s == null || s.length() == 0 || words.length == 0){
            return ans;
        }    

        //approach:- we need to do word based sliding window not the regular char based sliding window 
        HashMap<String, Integer> need= new HashMap<>();
        
        for(int i= 0; i< words.length; i++){
            need.put(words[i], need.getOrDefault(words[i], 0)+ 1);
        }//eg, foo-> 1, bar-> 1

        // Try every possible offset, basically here we r doing the word based sliding window
        for (int offset = 0; offset < wordLen; offset++) {

            int left = offset;
            int matched = 0;

            HashMap<String, Integer> seen = new HashMap<>();

            for (int right = offset;
                 right + wordLen <= s.length();
                 right += wordLen) {

                String word = s.substring(right, right + wordLen);

                // Invalid word:-
                if (!need.containsKey(word)) {
                    seen.clear();
                    matched = 0;
                    left = right + wordLen;
                    continue;
                }

                seen.put(word, seen.getOrDefault(word, 0) + 1);//otherwise 
                matched++;//increament matched 

                // Too many occurrences of current word
                while (seen.get(word) > need.get(word)) {

                    String leftWord = s.substring(left, left + wordLen);//shrinkd the window

                    seen.put(leftWord, seen.get(leftWord) - 1);//remove the word from seen as well

                    left += wordLen;
                    matched--;
                }

                // Found valid window
                if (matched == wordCount) {

                    ans.add(left);

                    String leftWord = s.substring(left, left + wordLen);

                    seen.put(leftWord, seen.get(leftWord) - 1);

                    left += wordLen;
                    matched--;
                }
            }
        }
        return ans;

    }
}
//tc - O(wordLen × (n / wordLen))= O(n) here each word is inserted once and removes once and sc is O(m), hashmap seen and need storing distinct character

/*A common interview question is: "Doesn't the while loop make it O(n²)?"

No. Although the while loop is nested inside the for loop, each iteration of the while advances left, and left never moves backward. Across the entire algorithm, both left and right each traverse the string at most once per offset. This is the same amortized analysis used for many sliding window algorithms, which is why the total running time remains linear. */
