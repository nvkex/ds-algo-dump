# Problem Link:
# https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
#
class Solution:
    def sum_of_dig(self, n: int) -> int:
        s = 0
        while n:
            s+=n%10
            n=n//10
        return s
    def countBalls(self, lowLimit: int, highLimit: int) -> int:
        arr = [0] * 46
        m = 0
        for i in range(lowLimit, highLimit+1):
            s = self.sum_of_dig(i)
            arr[s]+=1
            m = max(m, arr[s])
        return m
        