class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //using greedy algorithm here
        //sorting this 2d array by comparing its last column
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int cnt= 0, end= intervals[0][1];//end stores the position where my current arrow is effectively placed
        for(int i= 1; i< intervals.length; i++){
            if(intervals[i][0] < end){//no overlapping
                cnt++;//remove current interval
            }else{
                end= intervals[i][1]; //keeping the current interval
            }
        }
        return cnt;
    }
} 
//tc:- O(n)+ O(n logn)= O(n logn) and sc:- O(1)