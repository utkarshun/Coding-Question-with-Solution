class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_count=0
        count=0
        for i in range(len(nums)):
            if (nums[i]==1):
                count+=1
                if count>max_count:
                    max_count=count
            else:
                count=0
        return max_count
        # i=0
        # maxLen=0
        # for j in range(len(nums)):
        #     if nums[j]==0:
        #         i=j+1
        #     else:
        #         maxLen=max(maxLen,j-i+1)
        # return maxLen