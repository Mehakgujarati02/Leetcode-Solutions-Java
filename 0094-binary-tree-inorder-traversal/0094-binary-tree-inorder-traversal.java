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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    private void inorder(TreeNode root, List<Integer> ans){
        if(root== null) return;

        //using recursion to get inorder traversal
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);

    }
}//tc:- O(n) cuz traverse all the nodes once, total sc:- O(n) but auxilary space:- when balanced tree:- then O(long n) and if skewed the O(n), here it is optimized when comes to the tc but to make the space complexity better like O(1) we can use morris traversal, It avoids shared state between method calls and It's safer if the same Solution object is reused.