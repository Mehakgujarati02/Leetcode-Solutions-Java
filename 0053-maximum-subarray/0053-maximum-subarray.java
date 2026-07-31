//this approach:- KADANE ALGORITHM(OPTIMAL SOLUTION)

class Solution {
    public int maxSubArray(int[] nums) {
        int max= Integer.MIN_VALUE; 
        int sum=0;
        for(int r=0; r< nums.length; r++){
            sum+= nums[r];//extending the subarray
            max= Math.max(max, sum);

            if(sum <0) sum=0;//discard the negative prefix 
        }
        return max;
    }
}//tc :- O(n) and sc :- O(1)

/*another way to do this is DIVIDE AND CONQUER, when the subarray can be the leftsubarray or the rightsubarray or the cross having some elements from left and right:- 
class Solution {

    public int maxSubArray(int[] nums) {
        return solve(nums, 0, nums.length - 1);
    }

    private int solve(int[] nums, int l, int r) {

        if (l == r)
            return nums[l];

        int mid = l + (r - l) / 2;

        int left = solve(nums, l, mid);
        int right = solve(nums, mid + 1, r);

        int leftSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = mid; i >= l; i--) {
            sum += nums[i];
            leftSum = Math.max(leftSum, sum);
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;

        for (int i = mid + 1; i <= r; i++) {
            sum += nums[i];
            rightSum = Math.max(rightSum, sum);
        }

        int cross = leftSum + rightSum;

        return Math.max(cross, Math.max(left, right));
    }
} 
tc:- 2 T(n/2) + O(n)= O(n logn) by masters and sc:- O(log n) because of recursion stack */ 