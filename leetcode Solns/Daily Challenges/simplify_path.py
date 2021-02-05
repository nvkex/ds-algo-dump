# Problem Link:
# https://leetcode.com/problems/simplify-path/
#
class Solution:
    def simplifyPath(self, path: str) -> str:
        stack = deque()
        path = path.split("/")
        for dr in path:
            if dr == "..":
                if stack:
                    stack.pop()
            elif dr and dr != ".":
                stack.append(dr)
        return "/"+ "/".join(stack)
                    
                    