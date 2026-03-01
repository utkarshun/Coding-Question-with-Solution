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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null) return null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode slow=head;
        
        while(slow!=null){
            if(slow.next!=null && slow.val==slow.next.val){
                while(slow.next!=null && slow.val==slow.next.val){
                    slow=slow.next;
                }
                prev.next=slow.next;
            }
            else{
                prev=prev.next;
            }
            slow=slow.next;
        }
        return dummy.next;
    }
}