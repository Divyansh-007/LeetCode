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
    
     public ArrayList<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            ArrayList<Integer> ans =  new ArrayList<>();
            return ans;
        }
        
        ArrayList<Integer> left = inorderTraversal(root.left);
        
        if(left == null){
            ArrayList<Integer> ans = new ArrayList<>();
            
            ans.add(root.val);
            
            ArrayList<Integer> right = inorderTraversal(root.right);
            
            for(int i = 0; i < right.size(); i++){
                ans.add(right.get(i));
            }
            
            return ans;
        }else{
            left.add(root.val);
            
            ArrayList<Integer> right = inorderTraversal(root.right);
            
            for(int i = 0; i < right.size(); i++){
                left.add(right.get(i));
            }
            
            return left;
        }
    }
    
    public TreeNode buildTree(ArrayList<Integer> arr, int si, int ei){
        if(si > ei){
            return null;
        }
        
        int maxInd = si;
        for(int i = si + 1; i <= ei; i++){
            if(arr.get(i) > arr.get(maxInd)){
                maxInd = i;
            }
        }
        
        TreeNode root = new TreeNode(arr.get(maxInd));
        root.left = buildTree(arr,si,maxInd - 1);
        root.right = buildTree(arr,maxInd + 1,ei);
        
        return root;
    }
    
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        ArrayList<Integer> inorder = inorderTraversal(root);
        inorder.add(val);
        
        // for(int elem : inorder){
        //     System.out.print(elem + " ");
        // }
        
        return buildTree(inorder,0,inorder.size() - 1);
    }
}
