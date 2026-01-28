# class Solution:
#     def isPalindrome(self, s: str) -> bool:
#         cleaned=""
#         for c in s:
#             if c.isalnum():
#                 cleaned+=c.lower()
#             l,h=0,len(cleaned)-1
#         while(l<h):
#             if(cleaned[l]==cleaned[h]):
#                 l+=1
#                 h-=1
#             else:
#                 return False
#         return True
class Solution:
    def isPalindrome(self, s: str) -> bool:
        i,j=0,len(s)-1
        while (i<j):
            ci,cj=s[i],s[j]
            if not ci.isalnum():
                i+=1
                continue
            if not cj.isalnum():
                j-=1
                continue
            if ci.lower()!=cj.lower():
                return False
            i+=1
            j-=1
        return True


        