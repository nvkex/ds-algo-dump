# Problem Link:
# https://leetcode.com/problems/remove-duplicates-from-sorted-list
#

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        if head.val == head.next.val:
            head.next = head.next.next
            self.deleteDuplicates(head)
        else:
            self.deleteDuplicates(head.next)
        return head
            