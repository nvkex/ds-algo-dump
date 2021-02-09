# Problem Link:
# https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
#
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    maxSum = 0
    def convertBST(self, root: TreeNode) -> TreeNode:
        if root:
            self.convertBST(root.right)
            root.val = self.maxSum + root.val
            self.maxSum = root.val
            self.convertBST(root.left)
        return root
        