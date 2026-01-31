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
// class Solution {
//     public ListNode sortList(ListNode head) {
//         List<Integer>newList=new ArrayList<>();
//         ListNode temp=head;
//         while(temp!=null){
//             newList.add(temp.val);
//             temp=temp.next;
//         }
//         Collections.sort(newList);
//         temp=head;
//         int i=0;
//         while(temp!=null){
//             temp.val=newList.get(i);
//             temp=temp.next;
//             i++;
//         }
//         return head;
//     }
// }
class Solution {
    public ListNode sortList(ListNode head) {
    //     if(head==null || head.next==null) return head;
    //     ListNode mid=getMiddle(head);
    //     ListNode right=mid.next;
    //     mid.next=null;
    //     ListNode leftSorted=sortList(head);
    //     ListNode rightSorted=sortList(right);
    //     return merge(leftSorted,rightSorted);
    // }
    // private ListNode getMiddle(ListNode head){
    //     ListNode slow=head,fast=head,prev=null;
    //     while(fast!=null && fast.next!=null){
    //         prev=slow;
    //         slow=slow.next;
    //         fast=fast.next.next;
    //     }
    //     return prev==null?head:prev;
    // }
    // private ListNode merge(ListNode l1,ListNode l2){
    //     ListNode dummy=new ListNode(0);
    //     ListNode tail=dummy;
    //     while(l1!=null && l2!=null){
    //         if(l1.val<=l2.val){
    //             tail.next=l1;
    //             l1=l1.next;
    //         }else{
    //             tail.next=l2;
    //             l2=l2.next;
    //         }
    //         tail=tail.next;
    //     }
    //     tail.next=(l1!=null)?l1:l2;
    //     return dummy.next;
    List<Integer> arr=new ArrayList<>();
    ListNode temp=head;
    while(temp!=null){
        arr.add(temp.val);
        temp=temp.next;
    }
    Collections.sort(arr);
    temp=head;
    for(int value:arr){
        temp.val=value;
        temp=temp.next;
    }
    return head;
    }
}