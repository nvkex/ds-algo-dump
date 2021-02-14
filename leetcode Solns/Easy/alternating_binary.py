# Problem Link:
# https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
#
class Solution:
    def minOperations(self, s: str) -> int:
        ansx,ansy = 0,1
        x = s[0]
        y = str((int(x)+1)%2)
        s = s[1:]
        while s:
            if s[0] != x:
                x = s[0]
            else:
                ansx+=1
                x = str((int(s[0])+1)%2)
            if s[0] != y:
                y = s[0]
            else:
                ansy+=1
                y = str((int(s[0])+1)%2)
            s = s[1:]
        return min(ansx,ansy)