# class Solution:
#     def canPartition(self, nums: List[int]) -> bool:
#         total=sum(nums)
#         if total%2!=0:
#             return False
#         target=total//2
#         dp=[[-1 for _ in range(target+1)] for _ in range(len(nums))]
#         def f(ind,target):
#             if target==0:
#                 return True
#             if ind==0:
#                 return nums[0]==target
#             if dp[ind][target]!=-1:
#                 return dp[ind][target]
#             nottake=f(ind-1,target)
#             take=False
#             if(nums[ind]<=target):
#                 take=f(ind-1,target-nums[ind])
#             dp[ind][target]=take or nottake
#             return dp[ind][target]
#         return f(len(nums)-1,target)
class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        n=len(nums)
        total=sum(nums)
        if total%2!=0:
            return False
        target=total//2
        dp=[[False]*(target+1) for _ in range(n)]
        for i in range(n):
            dp[i][0]=True
        if nums[0]<=target:
            dp[0][nums[0]]=True
        for i in range(1,n):
            for t in range(1,target+1):
                nottake=dp[i-1][t]
                take=False
                if(nums[i]<=t):
                    take=dp[i-1][t-nums[i]]
                dp[i][t]=take or nottake
        return dp[n-1][target]