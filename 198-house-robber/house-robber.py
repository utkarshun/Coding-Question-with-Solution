# class Solution:
#     def rob(self, nums: List[int]) -> int:
#         n=len(nums)
#         dp=[-1]*n
#         def house(ind):
#             if ind==0:
#                 return nums[ind]
#             if ind<0:
#                 return 0
#             if dp[ind]!=-1:
#                 return dp[ind]
#             left=house(ind-1)
#             right=house(ind-2)+nums[ind]
#             dp[ind]=max(left,right)
#             return dp[ind]
#         return house(n-1)

class Solution:
    def rob(self, nums: List[int]) -> int:
        n=len(nums)
        dp=[0]*n
        dp[0]=nums[0]
        for i in range(1,n):
            take=nums[i]
            if (i>1):
                take+=dp[i-2]
            nottake=dp[i-1]
            dp[i]=max(take,nottake)
        return dp[n-1]