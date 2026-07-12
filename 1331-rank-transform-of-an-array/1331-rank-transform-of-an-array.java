class Solution {
    public int[] arrayRankTransform(int[] arr) {
        //first make a clone of array and sort it
        int[] sorted = arr.clone();

        Arrays.sort(sorted);

        //store the rank of the elements of this sorted array, only those element not seen before
        HashMap<Integer, Integer> rank = new HashMap<>();
        int currentRank = 1;

        for (int num : sorted) {
            if (!rank.containsKey(num)) {
                rank.put(num, currentRank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rank.get(arr[i]);
        }

        return arr;
    }
}// tc:- O(n logn)+ O(n)+ O(n)= O(n logn), total sc:- O(n)+ O(n)= O(n)