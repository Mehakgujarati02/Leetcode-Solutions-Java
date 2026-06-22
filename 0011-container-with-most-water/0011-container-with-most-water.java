class Solution {
    public int maxArea(int[] height) {
        //using the concept of two pointers
        int n= height.length;
        int left= 0;
        int right= n-1, area= 0;
        int maxArea= 0;

        while(left < right){
            int width= right- left;

            area= width * Math.min(height[left], height[right]);
                //maxArea= Math.max(maxArea, area);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }      
            maxArea= Math.max(maxArea, area);
        }
        return maxArea;
    }
}