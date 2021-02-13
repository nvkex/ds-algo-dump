# Problem Link:
# https://leetcode.com/problems/add-binary
#
class Solution:
    def addBinary(self, a: str, b: str) -> str:
        i = len(a)-1
        j = len(b)-1
        s=""
        c = 0
        while i>=0 and j>=0:
            add = int(a[i]) + int(b[j]) + c
            s = str(add%2) + s
            c = add//2
            i,j=i-1,j-1
        while i>=0:
            add = int(a[i]) + c
            s = str(add%2) + s
            c = add//2
            i-=1
        while j>=0:
            add = int(b[j]) + c
            s = str(add%2) + s
            c = add//2
            j-=1
        return s if c == 0 else str(c)+s
            