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
    public int helper(TreeNode root, int sum){
        if(root == null){
            return sum;
        }
        
        sum = helper(root.right,sum);
        sum = sum + root.val;
        root.val = sum;
        sum = helper(root.left,sum);
        
        return sum;
    }
    public TreeNode bstToGst(TreeNode root) {
        int sum = 0;
        helper(root,sum);
        
        return root;
    }
}
