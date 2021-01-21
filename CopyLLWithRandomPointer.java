/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        
        Node curr = head;
        Node temp = null;
        
        while(curr != null){
            temp = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = temp;
            curr = temp;
        }
        
        curr = head;
        
        while(curr != null){
            if(curr.next != null){
                if(curr.random != null){
                    curr.next.random = curr.random.next;
                }else{
                    curr.next.random = curr.random; 
                }
            }
            if(curr.next != null){
                curr = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        
        Node original = head;
        Node copy = head.next;
        temp = copy;
        
        while(original != null && copy!= null){
            
            if(original.next != null){
                original.next = original.next.next;
            }else{
                original.next = original.next;
            }
            
            if(copy.next != null){
                copy.next = copy.next.next;
            }else{
                copy.next = copy.next;
            }
            original = original.next;
            copy = copy.next;
        }
        
        return temp; 
    }
}
