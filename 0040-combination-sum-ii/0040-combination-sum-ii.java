class Solution {
    List<List<Integer>> res= new ArrayList<>(); 

    public void getComb(int[] candidates, int target, int index, List<Integer> curr){
        if(target== 0){
            res.add(new ArrayList<>(curr));
            return;//we dont want to continue the recursion
        }
        
        for(int i= index; i< candidates.length; i++){
            if(i> index && candidates[i]== candidates[i- 1]){//here we skip the duplicates
                continue;
            }

            if(candidates[i] >target){
               break;
            }

            curr.add(candidates[i]);
            getComb(candidates, target- candidates[i], i+ 1, curr );

            curr.remove(curr.size()- 1);//here we do backtrack to get the rest of the solutions as well
        }
    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);//sorting the element so that the duplicate elements remain together
        getComb(candidates, target, 0, new ArrayList<>());
        return res;
    }
}