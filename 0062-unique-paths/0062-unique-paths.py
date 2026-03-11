# class Solution(object):
#     def uniquePaths(self, m, n):
#         """
#         :type m: int
#         :type n: int
#         :rtype: int
#         """
#         dp=[[-1 for _ in range(n)] for _ in range(m)]
#         def f(i,j):
#             if dp[i][j]!=-1:
#                 return dp[i][j]
#             if (i==0 and j==0):
#                 return 1
#             if (i<0 or j<0):
#                 return 0
#             up=f(i-1,j)
#             left=f(i,j-1)
#             dp[i][j]=up+left
#             return dp[i][j]
#         return f(m-1,n-1)
class Solution(object):
    def uniquePaths(self, m, n):
        dp=[[0 for _ in range(n)] for _ in range(m)]
        for i in range(m):
            for j in range(n):
                if i==0 and j==0:
                    dp[i][j]=1
                else:
                    up=0
                    left=0
                    if i>0:
                        up=dp[i-1][j]
                    if j>0:
                        left=dp[i][j-1]
                    dp[i][j]=up+left
        return dp[m-1][n-1]

        