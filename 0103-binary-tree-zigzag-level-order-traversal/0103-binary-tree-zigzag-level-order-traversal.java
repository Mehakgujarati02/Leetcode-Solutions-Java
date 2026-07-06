/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;

        boolean flag = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int l = q.size();
            List<Integer> ans = new ArrayList<>();

            for(int i = 0; i < l; i++){
                TreeNode currNode = q.remove();
                ans.add(currNode.val);

                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }

            if(!flag){
                Collections.reverse(ans);//it takes the input list and reverse it
            }

            list.add(ans);
            flag = !flag;
        }
        return list;
    }
}//tc:- O(n), sc:- O(w) where w is the max width of the tree(queue), so worst sc is 
 //O(n) 