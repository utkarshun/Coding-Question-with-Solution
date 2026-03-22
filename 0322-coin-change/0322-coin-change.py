# class Solution:
#     def coinChange(self, coins: List[int], amount: int) -> int:
#         n=len(coins)
#         dp=[[-1]*(amount+1) for _ in range(n+1)]
#         def f(ind,target):
#             if ind==0:
#                 if target%coins[0]==0:
#                     return target//coins[0]
#                 else:
#                     return float('inf')
#             if dp[ind][target]!=-1:
#                 return dp[ind][target]
#             notTake=f(ind-1,target)
#             take=float('inf')
#             if coins[ind]<=target:
#                 take=1+f(ind,target-coins[ind])
#             dp[ind][target]=min(notTake,take)
#             return dp[ind][target]
#         ans=f(n-1,amount)
#         return -1 if ans==float('inf') else ans
class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        n=len(coins)
        dp=[[0]* (amount+1) for _ in range(n)]
        for t in range(amount+1):
            if (t%coins[0]==0):
                dp[0][t]=t//coins[0]
            else:
                dp[0][t]=float('inf')
        for ind in range(1,n):
            for target in range(amount+1):
                notTake=dp[ind-1][target]
                take=float('inf')
                if coins[ind]<=target:
                    take=1+dp[ind][target-coins[ind]]
                dp[ind][target]=min(take,notTake)
        ans=dp[n-1][amount]
        return -1 if ans==float('inf') else ans

        