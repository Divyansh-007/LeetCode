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
    public ListNode merge(ListNode head1, ListNode head2){
        if(head1 == null && head2 == null){
            return null;
        }else if(head1 == null && head2 != null){
            return head2;
        }else if(head1 != null && head2 == null){
            return head1;
        }
        
        ListNode finalHead = null;
        ListNode finalTail = null;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        
        if(temp1.val <= temp2.val){
            finalHead = temp1;
            finalTail = temp1;
            temp1 = temp1.next;
        }else{
            finalHead = temp2;
            finalTail = temp2;
            temp2 = temp2.next;
        }
        
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                finalTail.next = temp1;
                finalTail = finalTail.next;
                temp1 = temp1.next;
            }else{
                finalTail.next = temp2;
                finalTail = finalTail.next;
                temp2 = temp2.next;
            }   
        }
        
        if(temp1 != null){
            finalTail.next = temp1;
        }
        
        if(temp2 != null){
            finalTail.next = temp2;
        }
        
        return finalHead;
    }
    
    public ListNode middle(ListNode head){
        if(head == null){
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode first = head;
        ListNode mid = middle(head);
        ListNode second = mid.next;
        mid.next = null;
        
        return merge(sortList(first),sortList(second));
        
    }
}
