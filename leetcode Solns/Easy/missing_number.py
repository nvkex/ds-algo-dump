# Problem Link:
# https://leetcode.com/problems/missing-number/
#
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        ans=0;
        for i in range(len(nums)):
            ans^=nums[i]
            ans^=i+1
        return ans
        