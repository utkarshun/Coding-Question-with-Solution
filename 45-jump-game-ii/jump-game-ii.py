# class Solution:
#     def jump(self, nums: List[int]) -> int:
#         totalJumps=0
#         destination=len(nums)-1
#         coverage=0
#         lastJumpIdx=0
#         if(len(nums)==1):
#             return 0
#         for i in range(len(nums)):
#             coverage=max(coverage,i+nums[i])
#             if(i==lastJumpIdx):
#                 lastJumpIdx=coverage
#                 totalJumps+=1
#                 if(coverage>=destination):
#                     return totalJumps
#         return totalJumps
class Solution:
    def jump(self, nums: List[int]) -> int:
        jumps=0
        l=0
        r=0
        n=len(nums)
        while r<n-1:
            farthest=0
            for i in range(l,r+1):
                farthest=max(farthest,i+nums[i])
            l=r+1
            r=farthest
            jumps+=1
        return jumps