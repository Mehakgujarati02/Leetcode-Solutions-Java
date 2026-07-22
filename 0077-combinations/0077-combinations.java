class Solution {
    List<List<Integer>> res= new ArrayList<>();

    public void getComb(List<Integer> temp ,int n, int k, int start){
        if(temp.size()== k){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i= start; i <= n; i++){
            temp.add(i);
            getComb(temp, n, k, i+1); 
            
            temp.remove(temp.size()- 1);//backtrack to get the other solutions
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        getComb(new ArrayList<>(), n, k, 1);
        return res;
    }
}