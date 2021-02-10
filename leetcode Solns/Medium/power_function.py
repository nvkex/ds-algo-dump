# Problem link:
# https://leetcode.com/problems/powx-n
#
class Solution:        
    def myPow(self, x: float, n: int) -> float:
        if n==0:
            return 1
        if n < 0:
            n, x = -n, 1/x
        power = self.myPow(x, n//2)
        return power * power * x if n%2 else power * power
    