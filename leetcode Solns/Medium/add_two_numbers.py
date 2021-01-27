# Question link:
# https://leetcode.com/problems/add-two-numbers/
#
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
#________________________________________________________________________________
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        l3 = ListNode()
        head = l3
        carry = 0
        while True:
            if l1!=None and l2!=None:
                value = l1.val + l2.val + carry
                carry = int(value/10)
                value = int(value%10)
                l1 = l1.next
                l2 = l2.next
            elif l1!=None:
                value = l1.val + carry
                carry = int(value/10)
                value = int(value%10)
                l1 = l1.next
            elif l2!=None:
                value = l2.val + carry
                carry = int(value/10)
                value = int(value%10)
                l2 = l2.next
            else: 
                break
            l3.next = ListNode(val=value)
            l3 = l3.next
            if carry != 0:
                l3.next = ListNode(val=carry)
        return head.next
                
                