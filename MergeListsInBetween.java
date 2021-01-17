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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode aPrev = null;
        ListNode bNext = null;
        
        int count = 0;
        ListNode temp = list1;
        
        while(temp != null){
            if(count == a - 1){
                aPrev = temp;
                temp = temp.next;
                count++;
                continue;
            }
            
            if(count == b){
                bNext = temp.next;
                break;
            }
            
            count++;
            temp = temp.next;
        }
        
        System.out.print(aPrev.val + " " + bNext.val);
        
        ListNode temp1 = list2;
        
        while(temp1.next != null){
            temp1 = temp1.next;
        }
        
        aPrev.next = list2;
        temp1.next = bNext;
        
        return list1;
    }
}
