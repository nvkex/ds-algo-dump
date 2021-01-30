class Solution:
    def myAtoi(self, s: str) -> int:
        sign = ""
        num = 0
        flag = False
        for i in range(0, len(s)):
            asc = ord(s[i])
            if asc >=48 and asc<=57:
                num = num*10 + (asc-48)
            elif s[i] == '-' or s[i] == '+':
                sign += s[i]
            elif s[i] == ' ':
                pass
            elif s[i] == '.':
                break
            else:
                if s[i-1] != ' ':
                    flag = True
                break
        if flag:
            return 0
        
        negative = False
        if len(sign) > 1:
            return 0
        else:
            negative = True if sign == '-' else False
        
        if num >= -2**31 and num <= 2**31-1:
            return num if not negative else -num
        else:
            return 2**31-1 if not negative else -2**31