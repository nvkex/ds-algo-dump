# Problem Link:
# https://leetcode.com/problems/plus-one/
#
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n = str(int("".join([str(i) for i in digits])) + 1)
        return [int(i) for i in n]
        
            
        
        