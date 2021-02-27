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
    
    public List<List<Integer>> lvlOrder(TreeNode root){
        if(root == null){
            return new ArrayList<>();
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> curr = null;
        
        while(!q.isEmpty()){
            TreeNode front = q.poll();
            if(front == null){
                if(q.isEmpty()){
                    Collections.sort(curr);
                    ans.add(curr);
                    break;
                }else{
                    Collections.sort(curr);
                    ans.add(curr);
                    curr = null;
                    q.add(null);
                }
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
    
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> order = lvlOrder(root);
        
        for(int i = 0 ; i < order.size(); i++){
            List<Integer> curr = order.get(i);
            ans.add(curr.get(curr.size() - 1));
        }
        
        return ans;
    }
}
