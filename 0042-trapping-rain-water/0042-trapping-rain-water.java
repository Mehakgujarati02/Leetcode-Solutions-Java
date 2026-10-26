class Solution {
    public int trap(int[] height) {
        //water trapped is determined by the shorter one of the two maximum bar, leftmax(max bar of all the bars including the current) and rightmax(max bar of all the bars including the current), doing it by the two pointer approach.
        int n= height.length;
        int ans= 0;

        int[] leftMax= new int[n];
        int[] rightMax= new int[n];

        leftMax[0]= height[0];

        for(int i= 1; i< n; i++){
            //calculating leftmax including the current element
            leftMax[i]= Math.max(leftMax[i- 1], height[i]);
        }

        rightMax[n- 1]= height[n- 1];

        for(int i= n- 2; i>= 0; i--){
            //calculating rigthmax including the current element
            rightMax[i]= Math.max(rightMax[i+ 1], height[i]);
        }

        for(int i= 0; i <n; i++){
            ans+= Math.min(leftMax[i], rightMax[i])- height[i];
        }

        return ans;//this approach gives tc:- O(3n)= O(n) and sc:- O(1)
        
    }
}