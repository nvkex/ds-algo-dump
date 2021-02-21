# Problem Link:
# https://leetcode.com/problems/broken-calculator/
#
class Solution:
    def brokenCalc(self, X: int, Y: int) -> int:
        if Y<X:
            return X-Y
        elif Y==X:
            return 0
        elif Y%2==0:
            Y//=2
        else:
            Y+=1
        return 1 + self.brokenCalc(X, Y)