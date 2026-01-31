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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer>st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(!st.isEmpty()){
            if(temp.val!=st.pop()){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
}
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         if(head==null || head.next==null) return true;
//         ListNode slow=head,fast=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         if(fast!=null){
//             slow=slow.next;
//         }
//         ListNode second=reverseList(slow);
//         ListNode p1=head,p2=second;
//         boolean palindrome=true;
//         while(p2!=null){
//             if(p1.val!=p2.val){
//                 palindrome=false;
//                 break;
//             }
//             p1=p1.next;
//             p2=p2.next;
//         }
//         return palindrome;
//     }
//     private ListNode reverseList(ListNode head){
//         ListNode prev=null;
//         ListNode curr=head;
//         while(curr!=null){
//             ListNode next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         return prev;
//     }
// }