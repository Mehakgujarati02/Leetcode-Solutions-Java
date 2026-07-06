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
    List<Integer> list= new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root== null) return list;

        //using recursion to get inorder traversal
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);

        return list;
    }
}//tc:- O(n) cuz traverse all the nodes once, total sc:- O(n) but auxilary space:- when balanced tree:- then O(long n) and if skewed the O(n)