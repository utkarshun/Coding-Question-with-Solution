class Solution:
    def letterCasePermutation(self, s: str) -> List[str]:
        result=[]
        self.helper(s,0,[],result)
        return result
    def helper(self,s:str,ind:int,temp:List[str],result:List[str]):
        if ind>=len(s):
            result.append("".join(temp))
            return
        if s[ind].isdigit():
            temp.append(s[ind])
            self.helper(s,ind+1,temp,result)
            temp.pop()
        else:
            temp.append(s[ind].lower())
            self.helper(s,ind+1,temp,result)
            temp.pop()

            temp.append(s[ind].upper())
            self.helper(s,ind+1,temp,result)
            temp.pop()
            
        