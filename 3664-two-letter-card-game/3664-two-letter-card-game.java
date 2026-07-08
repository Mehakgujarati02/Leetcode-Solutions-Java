class Solution {
    public int score(String[] cards, char x) {
        int totalPairs = 0;

        //for set1 - (first char == x)
        int maxFreqSet1 = 0, totalCountSet1 = 0;
        int[] freqSet1 = new int[26];

        //for set2 - (second char == x)
        int maxFreqSet2 = 0, totalCountSet2 = 0;
        int[] freqSet2 = new int[26];

        //wild cards set 3(both chars == target)
        int bothTargetCount = 0;

        for(String card : cards) {
            char first = card.charAt(0);
            char second = card.charAt(1);

            if(first == x && second == x) {
                bothTargetCount++;
            }
            else if(first == x) {
                freqSet1[second - 'a']++;
                maxFreqSet1 = Math.max(maxFreqSet1, freqSet1[second - 'a']);
                totalCountSet1++;
            }
            else if(second == x) {
                freqSet2[first - 'a']++;
                maxFreqSet2 = Math.max(maxFreqSet2, freqSet2[first - 'a']);
                totalCountSet2++;
            }

            //skip if there's no x in card
        }


        //handle set1 using peigonhole principle
        if(maxFreqSet1 > totalCountSet1 - maxFreqSet1) {
            totalPairs += (totalCountSet1 - maxFreqSet1);
            totalCountSet1 = maxFreqSet1 - (totalCountSet1 - maxFreqSet1);
        }  else {
            totalPairs += totalCountSet1 / 2;
            totalCountSet1 %= 2;
        }

        //handle set2 using peigon hole principle
        if(maxFreqSet2 > totalCountSet2 - maxFreqSet2) {
            totalPairs += (totalCountSet2 - maxFreqSet2);
            totalCountSet2 = (maxFreqSet2 - (totalCountSet2 - maxFreqSet2));
        } else {
            totalPairs += (totalCountSet2 / 2);
            totalCountSet2 = (totalCountSet2 % 2);
        }

        //pair leftOver (remainders) from set1 and set2 with xx (double)
        int extraPairsCount = 0;
        int use = Math.min(totalCountSet1, bothTargetCount);
        extraPairsCount += use;
        bothTargetCount -= use;

        use = Math.min(totalCountSet2, bothTargetCount);
        extraPairsCount += use;
        bothTargetCount -= use;

        //try to use remaining "xx" to split existing pairs
        totalPairs = Math.min(totalPairs * 2, totalPairs + bothTargetCount / 2);

        //Add pairs we made from the leftovers
        totalPairs += extraPairsCount;

        return totalPairs;

    }
}