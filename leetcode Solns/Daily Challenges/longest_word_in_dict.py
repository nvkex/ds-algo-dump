# Problem Link:
# https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
#
class Solution:
    def findLongestWord(self, s: str, d: List[str]) -> str:
        ans = ""
        for word in d:
            a, b = len(word), len(ans)
            if a < b or (a == b and word > ans): continue
            i = -1
            for char in word:
                i = s.find(char, i + 1)
                if i == -1: break
            if i != -1: ans = word
        return ans