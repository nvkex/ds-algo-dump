class Solution:
    def scoreOfParentheses(self, S: str) -> int:
        score,curr = 0,0
        for i in range(len(S)):
            if S[i] == '(':
                curr+=1
            else:
                curr-=1
                if S[i-1] == '(':
                    score += 1<<curr
        return score