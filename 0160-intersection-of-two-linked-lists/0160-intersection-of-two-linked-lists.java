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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // HashSet<ListNode>set=new HashSet<>();
        ListNode prev=headA;
        ListNode curr=headB;
        while(prev!=curr){
            prev=(prev==null)?headB:prev.next;
            curr=(curr==null)?headA:curr.next;
        }
        return prev;
    }
}