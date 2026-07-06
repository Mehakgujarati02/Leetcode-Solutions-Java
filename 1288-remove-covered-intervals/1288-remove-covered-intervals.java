class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        //first sort the arraylist in increasing order but if the starts are equal then column sorted in decreasing order
        Arrays.sort(intervals, (a, b) -> 
            {if (a[0] == b[0])//eg:- [[1,4],[1,3]]
                return Integer.compare(b[1], a[1]);
            return Integer.compare(a[0], b[0]);    
        });

        int cnt= 1;//this solves the edge case also like when there is only one interval
        int end= intervals[0][1];
        for(int i= 1; i< intervals.length; i++){
            if(intervals[i][1] > end ){
                cnt++;//add current interval 
                end= intervals[i][1];//update the interval
            }
        }

        return cnt;
    }
}//tc:- O(n logn), sc:- O(n) cuz Arrays.sort(int[][], comparator) uses Java's TimSort, which requires O(n) auxiliary space in the worst case. (If asked specifically about Java's library implementation) otherwise acc to leetcode implementation its O(1)