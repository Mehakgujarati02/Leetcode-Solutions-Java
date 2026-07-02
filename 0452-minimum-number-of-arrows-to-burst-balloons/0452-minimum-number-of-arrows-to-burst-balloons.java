class Solution {
    public int findMinArrowShots(int[][] points) {
        //first we'll sort the array 
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));//sorting by first column

        if(points.length== 1){
            return 1;
        }

        int cnt= 1;//One arrow is placed to burst the first balloon. 
        int end= points[0][1];
        for(int i=1; i< points.length; i++){
            if(points[i][0] <= end){//compare the current balloon's start with the end of the current overlapping region
                end= Math.min(end, points[i][1]);
            } else{
                cnt++;
                end= points[i][1];
            }
        }
        return cnt;
    }
}