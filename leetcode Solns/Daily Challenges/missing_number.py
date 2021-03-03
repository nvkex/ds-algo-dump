# Problem Link:
# https://leetcode.com/problems/missing-number/
#
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        L = len(nums)
        return ((L*(1+L))//2) - sum(nums)