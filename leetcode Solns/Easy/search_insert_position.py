class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        u = 0
        v = len(nums)-1
        while u<=v:
            m = int((u+v)/2)
            if target < nums[m]:
                v = m-1
            elif target > nums[m]:
                u = m+1
            else:
                return m
        if target > nums[v]:
            return v+1
        elif target < nums[u]:
            return u
        return v