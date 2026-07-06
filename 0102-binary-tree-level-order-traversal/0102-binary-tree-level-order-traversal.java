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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list= new ArrayList<>();
        if(root== null) return list;

        //will be using queue here
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int l= q.size();
            List<Integer> ls= new ArrayList<>();
            for(int i= 0; i< l;i++){
                TreeNode currNode= q.remove();
                ls.add(currNode.val);

                if(currNode.left != null){
                    q.add(currNode.left);
                }

                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
            list.add(ls);
        }
        return list;
    }
} //tc:- O(n), sc= the queue stores at most one level of the tree, so worst sc will be O(n/2)= O(n) here that is the width of the tree(queue) so O(w)= O(n)