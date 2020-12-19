class Solution:
    def say(self,s:str, n:int) -> str:
        if n==1:
            return s
        new_s = ""
        f=0
        num = s[0]
        for i in range(len(s)):
            if s[i] == num:
                f = f+1
            else:
                new_s = new_s + str(f) + str(num)
                f=1
                num = s[i]
        new_s = new_s + str(f) + str(num)
        return self.say(new_s, n-1)
        
        
    def countAndSay(self, n: int) -> str:
        return self.say("1", n)