class Solution:
    def reverseWords(self, s: str) -> str:
        stack=[]
        word=""
        for ch in s:
            if ch!=' ':
                word+=ch
            else:
                if word:
                    stack.append(word)
                    word=""
        if word:
            stack.append(word)
        result=[]
        while stack:
            result.append(stack.pop())
        return " ".join(result)