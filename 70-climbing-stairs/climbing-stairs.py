class Solution:
    def climbStairs(self, n: int) -> int:
        dp=[-1]*(n+1)
        def climb(ind):
            if ind==0:
                return 1
            if (ind==1):
                return 1
            if(dp[ind]!=-1):
                return dp[ind]
            left=climb(ind-1)
            right=climb(ind-2)
            dp[ind]=left+right
            return dp[ind]
        return climb(n)
# from functools import lru_cache
# class Solution:
#     def climbStairs(self, n: int) -> int:
#         @lru_cache(None)
#         def climb(ind):
#             if ind==0 or ind==1:
#                 return 1
#             return climb(ind-1)+climb(ind-2)
#         return climb(n)