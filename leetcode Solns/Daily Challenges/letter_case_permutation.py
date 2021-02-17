# Problem Link:
# https://leetcode.com/problems/letter-case-permutation/
#
class Solution:
    
    def isAlpha(self, c: int) -> bool:
        if (c >= 65 and c <= 90) or (c >= 97 and c <= 122):
            return True
        return False
    
    def letterCasePermutation(self, S: str) -> List[str]:
        ans = [""]
        for c in S:
            if self.isAlpha(ord(c)):
                for i in range(len(ans)):
                    ans.append(ans[i]+c.lower())
                    ans[i] = ans[i]+c.upper()
            else:
                for i in range(len(ans)):
                    ans[i] += c
        return ans
                