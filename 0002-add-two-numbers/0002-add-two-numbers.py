# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        num1=[]
        num2=[]
        while(l1):
            num1.append(l1.val)
            l1=l1.next
        while(l2):
            num2.append(l2.val)
            l2=l2.next
        sumlist=[]
        carry=0
        i=0
        s=0
        while i<len(num1) or i<len(num2) or carry!=0:
            a=num1[i] if i<len(num1) else 0
            b=num2[i] if i<len(num2) else 0
            s=a+b+carry
            sumlist.append(s%10)
            carry=s//10
            i+=1
        dummy=ListNode(0)
        current=dummy
        for val in sumlist:
            current.next=ListNode(val)
            current=current.next
        return dummy.next