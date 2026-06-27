class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ls= new ArrayList<>();
        int[] need= new int[26];
        int[] window= new int[26];

        if(p.length() > s.length()){
            return ls;
        }
        for(int i= 0; i < p.length(); i++){
            window[s.charAt(i) - 'a']++;
            need[p.charAt(i)- 'a']++;

        }

        if(Arrays.equals(need, window)){
            ls.add(0);
        }

        //using sliding window
        for(int right= p.length(); right< s.length(); right++){
            window[s.charAt(right) - 'a']++;//adding new char
            window[s.charAt(right- p.length())- 'a']--;//removing old char;

            if(Arrays.equals(need, window)){
               //this way we can get the 1st encountered char
                ls.add(right- p.length() +1);

            }
        }
        return ls;
    }
}