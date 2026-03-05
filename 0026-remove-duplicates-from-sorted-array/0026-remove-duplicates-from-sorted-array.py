class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # unique=sorted(set(nums))
        # for i in range(len(unique)):
        #     nums[i]=unique[i]
        # return len(unique)
        i=0
        for j in range(1,len(nums)):
            if(nums[i]!=nums[j]):
                i+=1
                nums[i]=nums[j]
        return i+1