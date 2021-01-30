# Problem Link:
# https://leetcode.com/problems/zigzag-conversion/
#
class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        down = True
        zz = [""] * numRows
        i,j=0,0
        while j<len(s):
            if down:
                zz[i]+= s[j]
            else:
                zz[numRows-i-1]+=s[j]
            i+=1
            j+=1
            if i == numRows-1:
                i=0
                down = not down
        return "".join(zz)