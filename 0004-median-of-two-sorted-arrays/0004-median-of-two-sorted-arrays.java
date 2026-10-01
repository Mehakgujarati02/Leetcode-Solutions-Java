class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m= nums2.length;
        int c = n+m;
        int[] arr= new int[c];

        //using java method System.arraycopy for merging array in o(n1+n2) tc
        System.arraycopy(nums1, 0, arr, 0, n );
        System.arraycopy(nums2, 0, arr, n, m);
        Arrays.sort(arr);

        if (c % 2 == 1) {
            // odd number of elements
            return arr[c / 2];
        } else {
            // even number of elements
            return (arr[c / 2 - 1] + arr[c / 2]) / 2.0;
        }
    }
}