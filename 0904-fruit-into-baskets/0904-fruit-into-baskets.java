class Solution {
    public int totalFruit(int[] fruits) {
        int n= fruits.length;
        int left=0;
        int max=0;

        HashMap<Integer, Integer> freq= new HashMap<>();
        
        for(int right=0; right<n; right++){
            //int fruit= fruits[right];
            freq.put(fruits[right], freq.getOrDefault(fruits[right],0)+1);

             //shrinking the window to 2
            while(freq.size() >2){
                //int rfruit= fruits[left];
                int value= freq.get(fruits[left])-1;
                if(value >0){
                    freq.put(fruits[left], value);
                } else {
                    freq.remove(fruits[left]);
                }
                left++;
            }
            max= Math.max(max, right- left+ 1);
        }
        return max;
    }
}