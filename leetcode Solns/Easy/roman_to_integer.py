class Solution:
    def charToVal(self, n: int) -> int:
        if n%2 != 0:
            return (5*(int(n%2))) * (10**(int(n/2)))
        else:
            return (10**(int(n/2)))
    def romanToInt(self, s: str) -> int:
        ref = ['I', 'V', 'X', 'L', 'C', 'D', 'M']
        num = 0
        flag = 0
        for i in range(0, len(s)):
            if flag == 1:
                flag = 0
                continue
            val = 0
            curr_i = ref.index(s[i])
            next_i = 0
            if i<len(s)-1:
                next_i = ref.index(s[i+1])
            if next_i > curr_i:
                val = self.charToVal(next_i) - self.charToVal(curr_i)
                flag = 1
            else:
                val = self.charToVal(curr_i)
            num = num + val
        return num
                
        