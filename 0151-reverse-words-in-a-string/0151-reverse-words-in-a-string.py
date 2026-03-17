class Solution:
    def reverseWords(self, s: str) -> str:
        stack=[]
        word_list=[]
        # words=""
        for ch in s:
            if ch!=' ':
                word_list.append(ch)
            else:
                if word_list:
                    stack.append("".join(word_list))
                    word_list=[]
        if word_list:
            stack.append("".join(word_list))
        result=[]
        while stack:
            result.append(stack.pop())
            if stack:
                result.append(" ")
        return "".join(result)
