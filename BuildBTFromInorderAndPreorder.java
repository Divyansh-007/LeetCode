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
    
    public TreeNode buildTreeHelp(int[] pre, int siPre, int eiPre, int[] in, int siIn, int eiIn){
        if(siPre > eiPre){
            return null;
        }
        
        int rootData = pre[siPre];
        TreeNode root = new TreeNode(rootData);
        int rootIndex = -1;
        
        for(int i = 0; i <= eiIn; i++){
            if(in[i] == rootData){
                rootIndex = i;
                break;
            }
        }
        
        int siPreLeft = siPre + 1;
        int siInLeft = siIn;
        int eiInLeft = rootIndex - 1;
        int siInRight = rootIndex + 1;
        int eiPreRight = eiPre;
        int eiInRight = eiIn;
        
        int leftLen = eiInLeft - siInLeft + 1;
        int eiPreLeft = siPreLeft + leftLen - 1;
        int siPreRight = eiPreLeft + 1;
        
        TreeNode left = buildTreeHelp(pre,siPreLeft,eiPreLeft,in,siInLeft,eiInLeft);
        TreeNode right = buildTreeHelp(pre,siPreRight,eiPreRight,in,siInRight,eiInRight);
        
        root.left = left;
        root.right = right;
        
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelp(preorder,0,preorder.length - 1,inorder,0,inorder.length - 1);
    }
}
