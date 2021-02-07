# Problem Link:
# https://leetcode.com/problems/shortest-distance-to-a-character/
#
class Solution:
    def shortestToChar(self, s: str, c: str) -> List[int]:
        L = len(s)
        c_arr = []
        res = []
        x = 0
        for i in range(L):
            if s[i] == c:
                c_arr.append(i)
        left, right = c_arr[x], c_arr[x]
        x+=1
        for i in range(L):
            res.append(min(abs(i-left), abs(i-right)))
            if i == right:
                left = right
                if x < len(c_arr):
                    right = c_arr[x]
                    x+=1
        return res