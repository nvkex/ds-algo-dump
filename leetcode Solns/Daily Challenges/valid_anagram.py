# Problem Link:
# https://leetcode.com/problems/valid-anagram/
#
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        table = dict()
        for i in range(len(s)):
            if s[i] in table:
                table[s[i]] += 1
            else:
                table[s[i]] = 1
            if t[i] in table:
                table[t[i]] -= 1
            else:
                table[t[i]] = -1
        for i in table.values():
            if i != 0:
                return False
        return True
                