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
    
    public TreeNode buildTreeHelp(int[] in, int siIn, int eiIn, int[] pos, int siPos, int eiPos){
        if(siPos > eiPos){
            return null;
        }
        
        int rootData = pos[eiPos];
        TreeNode root = new TreeNode(rootData);
        int rootIndex = -1;
        
        for(int i = 0; i <= eiIn; i++){
            if(in[i] == rootData){
                rootIndex = i;
                break;
            }    
        }
        
        int siInLeft = siIn;
        int siPosLeft = siPos;
        int eiInLeft = rootIndex - 1;
        int siInRight = rootIndex + 1;
        int eiInRight = eiIn;
        int eiPosRight = eiPos - 1;
        
        int leftLen = eiInLeft - siInLeft + 1;
        int eiPosLeft = siPosLeft + leftLen - 1;
        int siPosRight = eiPosLeft + 1;
        
        
        TreeNode left = buildTreeHelp(in,siInLeft,eiInLeft,pos,siPosLeft,eiPosLeft);
        TreeNode right = buildTreeHelp(in,siInRight,eiInRight,pos,siPosRight,eiPosRight);
        
        root.left = left;
        root.right = right;
        
        return root;
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelp(inorder,0,inorder.length - 1,postorder,0,postorder.length - 1);
    }
}
