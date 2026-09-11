class Solution {
    public int totalNumbers(int[] digits) {
       HashSet<Integer> set= new HashSet<>();
       int n= digits.length;
       for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(i!=j && j!=k && k!= i){
                        if(digits[i] !=0 && digits[k] %2== 0){
                            int number= 100 *digits[i] + 10*digits[j] + digits[k];

                            set.add(number);
                        }
                    }
                }
            }

        } 
        return set.size();
    }
}