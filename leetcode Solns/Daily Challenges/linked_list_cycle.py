# Problem Link:
# https://leetcode.com/problems/linked-list-cycle/
#
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        if head == None or head.next == None:
            return False
        half = head
        head = head.next.next
        while half != head:
            if head == None or head.next == None:
                return False
            head = head.next.next
            half = half.next
        return True