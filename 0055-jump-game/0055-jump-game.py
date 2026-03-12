# class Solution:
#     def canJump(self, nums: List[int]) -> bool:
#         finalposition=len(nums)-1
#         n=len(nums)
#         for i in range(n-2,-1,-1):
#             if(i+nums[i]>=finalposition):
#                 finalposition=i
#         return finalposition==0
class Solution:
    def canJump(self, nums: List[int]) -> bool:
        maxReach=0
        for i in range(len(nums)):
            if i>maxReach:
                return False
            maxReach=max(maxReach,i+nums[i])
        return True