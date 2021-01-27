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
    
    public TreeNode sortedArrayToBSTHelp(int[] arr, int low, int high){
        if(low > high){
            return null;
        }
        
        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = sortedArrayToBSTHelp(arr,low,mid - 1);
        root.right = sortedArrayToBSTHelp(arr,mid + 1,high);
        
        return root;
    }
    

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        
        return sortedArrayToBSTHelp(nums,0,nums.length - 1);
    }
}
