class Solution:
    def reverseWords(self, s: str) -> str:
        stack=[]
        words=""
        for ch in s:
            if ch!=' ':
                words+=ch
            else:
                if words:
                    stack.append(words)
                    words=""
        if words:
            stack.append(words)
        result=[]
        while stack:
            result.append(stack.pop())
            if stack:
                result.append(" ")
        return "".join(result)
