# Problem Link:
# https://leetcode.com/problems/restore-the-array-from-adjacent-pairs/
#
class Solution:
    def restoreArray(self, adjacentPairs: List[List[int]]) -> List[int]:
        g = defaultdict(set)
        for a,b in adjacentPairs:
            g[a].add(b)
            g[b].add(a)
            
        arr = deque([adjacentPairs[0][0]])
        visited = set([arr[0]])
        
        def traverse():
            x = arr[-1]
            for i in g[x]:
                if i not in visited:
                    arr.append(i)
                    visited.add(i)
                    break
            x = arr[0]
            for i in g[x]:
                if i not in visited:
                    visited.add(i)
                    arr.appendleft(i)
                    return
        while len(arr)<=len(adjacentPairs):
            traverse()
            
        return arr                    