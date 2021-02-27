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
    
    public ArrayList<ArrayList<Integer>> lvlOrder(TreeNode root){
        if(root == null){
            return new ArrayList<>();
        }
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> curr = null;
        
        while(!q.isEmpty()){
            TreeNode front = q.poll();
            if(front == null){
                if(q.isEmpty()){
                    ans.add(curr);
                    break;
                }
                ans.add(curr);
                curr = null;
                q.add(null);
            }else{
                if(curr == null){
                    curr = new ArrayList<Integer>();
                    curr.add(front.val);
                }else{
                    curr.add(front.val);
                }
                
                if(front.left != null){
                    q.add(front.left);
                }
                
                if(front.right != null){
                    q.add(front.right);
                }
            }
        }
        
        return ans;
    }
    
    public int findBottomLeftValue(TreeNode root) {
        ArrayList<ArrayList<Integer>> order = lvlOrder(root);
        return order.get(order.size() - 1).get(0);
    }
}
