# Problem Link:
# https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
#
class Solution:
    def numberOfSteps (self, num: int) -> int:
        if num == 1 or num == 0:
            return num
        if num%2:
            num-=1
        else:
            num//=2
        return 1 + self.numberOfSteps(num)