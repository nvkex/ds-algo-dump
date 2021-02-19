# Problem Link:
# https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
#
class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        i = 0
        q = []
        while i<len(s):
            if s[i] == ')':
                if len(q) == 0:
                    s = s[0:i]+s[i+1:]
                else:
                    q.pop()
                    i+=1
            elif s[i] == '(':
                q.append('(')
                i+=1
            else:
                i+=1
        i=len(s)-1
        while i>=0 and q:
            if s[i] == '(':
                s = s[0:i]+s[i+1:]
                q.pop()
            i-=1
        return s
            
        
                