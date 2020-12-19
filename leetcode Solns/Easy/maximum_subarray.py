class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currentMax = nums[0]
        globalMax = nums[0]
        for x in range(1,len(nums)):
            if nums[x] > nums[x] + currentMax:
                currentMax = nums[x]
            else:
                currentMax = nums[x] + currentMax
            if currentMax > globalMax:
                globalMax = currentMax
        return globalMax
                