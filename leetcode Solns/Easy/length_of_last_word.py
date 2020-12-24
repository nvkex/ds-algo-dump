class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        word_list = s.strip().split(" ")
        l = len(word_list)
        if l>0:
            return len(word_list[l-1])
        else:
            return l