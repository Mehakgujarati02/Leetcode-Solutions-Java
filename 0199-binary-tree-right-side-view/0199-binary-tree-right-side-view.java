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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        
        //using bfs, level order traversal
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root); //we r using offer() as it returns false if the queue is full but add() throws an exception so its reommended to use for queue and usually behaves same

        while( !q.isEmpty()){
            int n= q.size();//no of the nodes at a level

            for(int i=0; i< n; i++){

                TreeNode curr= q.poll(); //we only process the nodes that are in the queue

                //when last node of the level, we'll add it to the queue
                if(i == n-1){
                    ans.add(curr.val);
                }

                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }

            }
        }
        return ans;  
    }        
}