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
    
    public ArrayList<Integer> inOrder(TreeNode root){
        if(root == null){
            return null;
        }
        
        ArrayList<Integer> left = inOrder(root.left);
        
        if(left == null){
            ArrayList<Integer> order = new ArrayList<>();
            order.add(root.val);
            ArrayList<Integer> right = inOrder(root.right);
            
            if(right == null){
                return order;
            }
            
            for(int elem : right){
                order.add(elem);
            }
            
            return order;
        }else{
            left.add(root.val);
            ArrayList<Integer> right = inOrder(root.right);
            
            if(right == null){
                return left;
            }
            
            for(int elem : right){
                left.add(elem);
            }
            
            return left;
        }
    }
    
    public TreeNode buildBST(ArrayList<Integer> arr, int low, int high){
        if(low > high){
            return null;
        }
        
        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = buildBST(arr,low,mid - 1);
        root.right = buildBST(arr,mid + 1,high);
        
        return root;
    }
    
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> order = inOrder(root);
        
        for(int elem : order){
            System.out.print(elem + " ");
        }
        
        return buildBST(order,0,order.size() - 1);
    }
}
