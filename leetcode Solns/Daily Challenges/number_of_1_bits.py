# Problem Link:
# https://leetcode.com/problems/number-of-1-bits/
#
class Solution:
    def hammingWeight(self, n: int) -> int:
        c = 0
        while n:
            c+=n%2
            n = n>>1
        return c