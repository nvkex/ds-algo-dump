class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for char in s:
            try:
                if char == ")":
                    if stack.pop() != "(":
                        return False
                elif char == "}":
                    if stack.pop() != "{":
                        return False
                elif char == "]":
                    if stack.pop() != "[":
                        return False
                else:
                    stack.append(char)
            except IndexError:
                return False

        return len(stack) == 0
            
        
        