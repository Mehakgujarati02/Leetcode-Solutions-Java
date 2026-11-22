class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //using binary search here
        int min= 1;
        int max= Arrays.stream(piles).max().getAsInt();
        int ans= min;

        while(min <=max){
            int mid= min +(max- min)/ 2;
            if(isDone(piles, h, mid)){
                ans= mid;
                max= mid -1;
            }else{
                min= mid +1;
            }
        }
        return ans;

    }

    public boolean isDone(int[] piles, int h, int k){
        long hours= 0;

        for(int i= 0; i< piles.length; i++){
            hours+= piles[i]/k;

            if(piles[i]% k != 0){
                hours++;
            }
        }
        return hours<= h;

    }
}