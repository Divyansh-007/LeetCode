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
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null){
            List<Double> ans = new ArrayList<>();
            return ans;
        }
        
        List<Double> ans = new ArrayList<>();
        double lvlSum = 0;
        int count = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            TreeNode front = q.poll();
            if(front == null){
                if(q.isEmpty()){
                    double lvlAvg = lvlSum / count;
                    ans.add(lvlAvg);    
                    break;
                }
                
                double lvlAvg = lvlSum / count;
                ans.add(lvlAvg);
                lvlSum = 0.0;
                count = 0;
                q.add(null);
            }else{
                lvlSum = lvlSum + front.val;
                count++;
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
}
