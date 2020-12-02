class Solution:
    def isPalindrome(self, x: int) -> bool:
        y = int(0)
        z = x
        while x:
            y = y*10 + x%10
            x = int(x/10)
        if int(y) == z:
            return True
        else:
            return False
        