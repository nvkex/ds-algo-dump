# Problem Link:
# https://leetcode.com/problems/binary-tree-right-side-view/
#

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:            
    depth = 0
    arr = []
    def view(self, root: TreeNode, c: int):
        if not root:
            return
        if c > self.depth:
            self.arr.append(root.val)
        c+=1
        self.depth = max(c, self.depth)
        self.view(root.right, c+1)
        self.view(root.left, c+1)
        
    def rightSideView(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        self.arr = [root.val]
        self.depth = 0
        self.view(root, 0)
        
        return self.arr