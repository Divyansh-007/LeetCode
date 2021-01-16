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
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        
        List<Integer> left = postorderTraversal(root.left);
        List<Integer> right = postorderTraversal(root.right);
        
        if(left == null && right == null){
            List<Integer> ans = new ArrayList<>();
            ans.add(root.val);
            return ans;
        }else if(right == null){
            left.add(root.val);
            return left;
        }else{
            for(int i = 0; i < right.size(); i++){
                left.add(right.get(i));
            }
            
            left.add(root.val);
            return left;
        }
    }
}
