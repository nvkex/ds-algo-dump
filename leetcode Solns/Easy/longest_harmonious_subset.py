# Problem Link:
# https://leetcode.com/problems/longest-harmonious-subsequence/
#
class Solution:
    def findLHS(self, nums: List[int]) -> int:
        ans = 0
        g = defaultdict()
        for i in nums:
            if i in g:
                g[i] += 1
            else:
                g[i] = 1
        if len(g) == 1:
            return 0
        for i in g:
            if i+1 in g:
                ans = max(g[i]+g[i+1], ans)
        return ans