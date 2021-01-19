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
class Solution {
    
    public void rev(ArrayList<Integer> arr, int si, int ei){
        while(si < ei){
            int temp = arr.get(ei);
            arr.set(ei, arr.get(si));
            arr.set(si,temp);
            si++;
            ei--;
        }    
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        
        for(int i = 0; i + k - 1 < arr.size(); i = i + k){
            rev(arr, i, i + k - 1);
        }
        
        // for(int elem : arr){
        //     System.out.print(elem + " ");
        // }
        
        ListNode newHead = new ListNode(arr.get(0));
        ListNode newTemp = newHead;
        
        for(int i = 1; i < arr.size(); i++){
            ListNode newNode = new ListNode(arr.get(i));
            newTemp.next = newNode;
            newTemp = newNode;
        }
        
        return newHead;
    }
}
