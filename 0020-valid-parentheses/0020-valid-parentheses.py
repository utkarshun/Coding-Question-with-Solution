class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        mp={
            ')':'(',
            '}':'{',
            ']':'['
        }
        for ch in s:
            if ch in mp:
                top=stack.pop() if stack else '#'
                if top!=mp[ch]:
                    return False
            else:
                stack.append(ch)
        return len(stack)==0

        