class Solution {
    List<List<Integer>> res= new ArrayList<>();

    public void getPerm(int[] nums, int index){
        //here is the base case
        if(index== nums.length){
            List<Integer> ans= new ArrayList<>();//here instead of passing the list in the rscursion call everytime that this condition hits we make a list and store the elements in the ans list, this helps keep the auxilary space as O(n)

            for(int num: nums){
                ans.add(num);
            }
            if(!res.contains(ans)){
                res.add(ans);
                return;
            }//as we dont want to recurse further
        }

        for(int i= index; i< nums.length; i++){

            swap(nums, index, i);//swap index with the i, here doing swap instead of making new array to space optimize

            getPerm(nums, index+ 1);//recurse to the other index

            swap(nums, index, i);//this is the backtracking step where we swap the already swaped elements for further calculation
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        getPerm(nums, 0);

        return res;
    }
}