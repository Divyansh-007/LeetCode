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
    
    public void pathSumHelp(TreeNode root, int sum, List<List<Integer>> res, List<Integer> path){
        if(root == null){
            return;
        }
        
        path.add(root.val);
        
        if(root.left == null && root.right == null){
            if(root.val == sum){
                res.add(new ArrayList(path));
            }
        }
        
        pathSumHelp(root.left,sum - root.val,res,path);
        pathSumHelp(root.right,sum - root.val,res,path);
        
        path.remove(path.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        pathSumHelp(root,targetSum,ans,path);
        return ans;
    }
}
