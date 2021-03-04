/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int length(ListNode head){
        if(head == null){
            return 0;
        }
        
        int smallOutput = length(head.next);
        
        return smallOutput + 1;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        
        ListNode ans = null;
        int l1 = length(headA);
        int l2 = length(headB);
        
        int diff = Math.abs(Math.subtractExact(l1,l2));
        
        if(l2 > l1){
            ListNode temp1 = headA;
            ListNode temp2 = headB;
            
            int i = 0;
            while(i < diff){
                temp2 = temp2.next;
                i++;
            }
            
            while(temp1 != null && temp2 != null){
                if(temp1 == temp2){
                    ans = temp1;
                    break;
                }else{
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
            }
        }else{
            ListNode temp1 = headA;
            ListNode temp2  = headB;
            
            int i = 0;
            while(i < diff){
                temp1 = temp1.next;
                i++;
            }
            
            while(temp1 != null && temp2 != null){
                if(temp1 == temp2){
                    ans = temp1;
                    break;
                }else{
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
            }
        }
        
        return ans;
    }
}
