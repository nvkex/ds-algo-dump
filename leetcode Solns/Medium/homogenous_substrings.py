# Problem Link:
# https://leetcode.com/problems/count-number-of-homogenous-substrings/
#
class Solution:
    def countHomogenous(self, s: str) -> int:
        c = 0
        sub_c = 1
        for i in range(len(s)-1):
            if s[i] == s[i+1]:
                sub_c+=1
            else:
                c+= sub_c*(sub_c+1)//2
                sub_c = 1
        c+= sub_c*(sub_c+1)//2
        return c%(10**9+7)
                