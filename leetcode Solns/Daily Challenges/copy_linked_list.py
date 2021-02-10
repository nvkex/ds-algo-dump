# Problem Link:
# https://leetcode.com/problems/copy-list-with-random-pointer/
#

"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Node') -> 'Node':
        cpy = Node(0)
        cpy_head = cpy
        trvs = head
        while trvs:
            temp = trvs.next
            cpy.next = Node(trvs.val)
            cpy = cpy.next
            cpy.random = temp
            trvs.next = cpy
            trvs = temp
        trvs = head
        cpy = cpy_head.next
        while trvs:
            temp = cpy.random
            if trvs.random:
                cpy.random = trvs.random.next
            else:
                cpy.random = None
            trvs = temp
            cpy = cpy.next
        return cpy_head.next