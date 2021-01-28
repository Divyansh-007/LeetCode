/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    
    public ArrayList<Integer> LLtoArr(ListNode head){
        if(head == null){
            return new ArrayList<Integer>();
        }
        
        ListNode temp = head;
        ArrayList<Integer> ans = new ArrayList();
        
        while(temp != null){
            ans.add(temp.val);
            temp = temp.next;
        }
        
        return ans;
    }
    
    public TreeNode buildTree(ArrayList<Integer> arr, int si, int ei){
        if(si > ei){
            return null;
        }
        
        int mid = (si + ei) / 2;
        TreeNode root = new TreeNode(arr.get(mid));
        
        root.left = buildTree(arr,si,mid - 1);
        root.right = buildTree(arr,mid + 1,ei);
        
        return root;
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> arr = LLtoArr(head);
        return buildTree(arr,0,arr.size() - 1);
    }
}
