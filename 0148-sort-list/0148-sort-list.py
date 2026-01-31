# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# class Solution:
#     def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
#         if(head is None or head.next is None):
#             return head
#         mid=self.getMiddle(head)
#         right=mid.next
#         mid.next=None
#         leftSorted=self.sortList(head)
#         rightSorted=self.sortList(right)
#         return self.merge(leftSorted,rightSorted)
#     def getMiddle(self,head:Optional[ListNode])->Optional[ListNode]:
#         slow=head
#         fast=head
#         prev=None
#         while(fast and fast.next):
#             prev=slow
#             slow=slow.next
#             fast=fast.next.next
#         return prev
#     def merge(self,a:Optional[ListNode],b:Optional[ListNode]):
#         dummy=ListNode(0)
#         tail=dummy
#         while a and b:
#             if a.val<=b.val:
#                 tail.next=a
#                 a=a.next
#             else:
#                 tail.next=b
#                 b=b.next
#             tail=tail.next
#         tail.next=a if a else b
#         return dummy.next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        arr=[]
        temp=head
        while temp is not None:
            arr.append(temp.val)
            temp=temp.next
        arr.sort()
        temp=head
        for value in arr:
            temp.val=value
            temp=temp.next
        return head



        