# Problem link:
# https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/582/week-4-january-22nd-january-28th/3619/
# 
class Solution:
    def getSmallestString(self, n: int, k: int) -> str:
        s = ""
        while k>0:
            if k<26+n-1:
                c = chr(96+k-n+1)
                s = c+s
                k=k-(k-n+1)
            else:
                s = "z"+s
                k=k-26
            n-=1
        return s