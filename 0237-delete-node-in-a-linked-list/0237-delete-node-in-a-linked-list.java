/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode next=node.next;
        ListNode nextToNext=next.next;
        
        node.val=next.val;
        node.next=nextToNext;
        
    }
}