class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 0:
            return ""
        elif len(strs) == 1:
            return strs[0]
        for j in range(1, len(strs[0])+1):
            for str in strs:
                if str[0:j].find(strs[0][0:j]) == -1:
                    if len(strs[0][0:j-1]) == 0:
                        return ""
                    return strs[0][0:j-1]
        return strs[0]