class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels="aeiouAEIOU"
        l,r=0,len(s)-1
        c=list(s)
        while l<r:
            if c[l] not in vowels:
                l+=1
            elif c[r] not in vowels:
                r-=1
            else:
                c[l],c[r]=c[r],c[l]
                l+=1
                r-=1
        return "".join(c)
