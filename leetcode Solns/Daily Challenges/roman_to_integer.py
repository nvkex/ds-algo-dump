# Problem Link:
# https://leetcode.com/problems/roman-to-integer/
#
class Solution:
    def romanToInt(self, s: str) -> int:
        sym = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        ans = 0
        i = 0
        L=len(s)
        while i<L:
            if i!=L-1 and sym[s[i+1]] > sym[s[i]]:
                ans+= sym[s[i+1]]-sym[s[i]]
                i+=1
            else:
                ans+=sym[s[i]]
            i+=1
        return ans
                
                