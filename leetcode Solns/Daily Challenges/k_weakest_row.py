# Problem Link:
# https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
#

class Solution:
    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        ans = []
        for i in range(len(mat)):
            s = sum(mat[i])
            ans.append(dict({"i":i, "s": s}))
        ans.sort(key=lambda x: x['s'])
        return [i['i'] for i in ans[0:k]]