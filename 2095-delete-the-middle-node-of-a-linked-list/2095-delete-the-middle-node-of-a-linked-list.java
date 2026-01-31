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
        if(head==null || head.next==null) return head;
        ListNode temp=null;
        ListNode prev=head;
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            temp=prev;
            prev=prev.next;
            curr=curr.next.next;
        }
        temp.next=prev.next;
        return head;
    }
}