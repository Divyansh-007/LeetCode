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
    
    public void merge(ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> output){
        if(arr1 == null && arr2 == null){
            return;
        }else if(arr1 == null && arr2 != null){
            output = arr2;
            return;
        }else if(arr1 != null && arr2 == null){
            output = arr1;
            return;
        }
        
        int m = arr1.size();
        int n = arr2.size();
        
        int i = 0;
        int j = 0;
        
        while(i < m && j < n){
            if(arr1.get(i) <= arr2.get(j)){
                output.add(arr1.get(i));
                i++;
            }else{
                output.add(arr2.get(j));
                j++;
            }
        }
        
        while(i < m){
            output.add(arr1.get(i));
            i++;
        }
        
        while(j < n){
            output.add(arr2.get(j));
            j++;
        }
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = inorderTraversal(root1);
        ArrayList<Integer> list2 = inorderTraversal(root2);
        ArrayList<Integer> list = new ArrayList<>();
        
        merge(list1,list2,list);
        
        return list;
    }
}
