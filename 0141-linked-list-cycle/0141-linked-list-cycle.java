/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head==null) return false;
        ListNode temp=head;
        ListNode temp2=head;
        
        
        while(true){
            temp=temp.next;
            if(temp==null) return false;
            temp2=temp2.next;
            if(temp2==null) return false;
            temp=temp.next;
            if(temp==null) return false;
            
            if(temp==temp2) return true;
            
        }
        
    }
}