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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        
        ListNode dummySlow=new ListNode(-1);
        dummySlow.next=head;
        ListNode dummyFast=dummySlow;
        ListNode dummyAnswer=dummySlow;
        
        while(dummyFast.next!=null){
            dummyFast=dummyFast.next;
            if(dummyFast.next==null) break;
            dummyFast=dummyFast.next;
            dummySlow=dummySlow.next;
        }
        
        dummySlow.next=dummySlow.next.next;
        return dummyAnswer.next;
        
        
        
        
    }
}