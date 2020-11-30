class Solution:
    def reverse(self, x: int) -> int:
        num = 0
        y = int(x)
        if x < 0:
            x = 0-x
            
        while x > 0:
            num = (num * 10) + (x%10)
            x = int(x / 10)
        if 2**31 < num or -(2**31) >= num:
            return 0
        if y < 0:
            return -num
        else:
            return num
        