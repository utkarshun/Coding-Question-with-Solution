class Solution:
    def canJump(self, nums: List[int]) -> bool:
        finalposition=len(nums)-1
        n=len(nums)
        for i in range(n-2,-1,-1):
            if(i+nums[i]>=finalposition):
                finalposition=i
        return finalposition==0