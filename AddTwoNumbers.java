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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 != null) {
			return l2;
		}else if(l1 != null && l2 == null) {
			return l1;
		}else if(l1 == null && l2 == null) {
			return null;
		}

        ListNode result= null;
		ListNode temp = null;
        ListNode sumDigit=null;
	    
		int carry = 0,sum;

		while(l1 != null || l2 != null) {

			if(l1 == null) {
				sum = l2.val + carry;
			}else if(l2 == null) {
				sum = l1.val + carry;
			}else {
				sum = l1.val + l2.val + carry;
			}
           
			if(sum >=10) {
				sum = sum % 10;
				carry = 1;
			}
            else{
                carry=0;
                sum=sum%10;
            }
            
			sumDigit = new ListNode(sum);

			if(result == null) {
				result = sumDigit;
			}else {
				temp.next = sumDigit;
			}
            temp= sumDigit;

			if(l1 != null) {
				l1 = l1.next;
			}

			if(l2 != null) {
				l2 = l2.next;
			}
		}

		if(carry > 0) {
			sumDigit.next= new ListNode(carry);
		}

		return result;
    }
}
