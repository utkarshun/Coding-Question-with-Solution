class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        i=0
        j=0
        n=len(nums)
        while(j<n):
            if(nums[j]!=val):
                nums[i]=nums[j]
                i+=1
                j+=1
            else:
                j+=1
        return i

        