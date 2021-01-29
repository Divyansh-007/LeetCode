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
    public ArrayList<Integer> inorder(TreeNode root){
        if(root == null){
            return null;
        }
        
        ArrayList<Integer> left = inorder(root.left);
        
        if(left != null){
            left.add(root.val);
            
            ArrayList<Integer> right = inorder(root.right);
            
            if(right == null){
                return left;
            }
            
            for(int i = 0; i < right.size(); i++){
                left.add(right.get(i));
            }
            
            return left;
        }else{
            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans.add(root.val);
            
            ArrayList<Integer> right = inorder(root.right);
            
            if(right == null){
                return ans;
            }
            
            for(int i = 0; i < right.size(); i++){
                ans.add(right.get(i));
            }
            
            return ans;
        }
    }
    
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> inOrder = inorder(root);
        return inOrder.get(k - 1);
    }
}
