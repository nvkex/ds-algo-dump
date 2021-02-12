# Problem Link:
# https://leetcode.com/problems/3sum-closest/
#
class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        diff = sys.maxsize
        l = len(nums)
        for i in range(l-1):
            j = i+1
            k = l-1
            s=0
            while j < k:
                s = nums[i]+nums[j]+nums[k]
                if abs(s-target) < abs(diff):
                    diff = target-s
                if s > target:
                    k-=1
                else:
                    j+=1
            if diff == 0:
                break
        return target-diff
                    
        