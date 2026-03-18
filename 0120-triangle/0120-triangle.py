# class Solution:
#     def minimumTotal(self, triangle: List[List[int]]) -> int:
#         m=len(triangle)
#         # n=len(triangle[0])
#         dp=[[-1 for _ in range(len(triangle[i]))] for i in range(m)]
#         def f(i,j):
#             if (i==m-1):
#                 return triangle[i][j]
#             if (dp[i][j]!=-1):
#                 return dp[i][j]
#             down=triangle[i][j]+f(i+1,j)
#             diagonal=triangle[i][j]+f(i+1,j+1)
#             dp[i][j]=min(down,diagonal)
#             return dp[i][j]
#         return f(0,0)
# class Solution:
#     def minimumTotal(self, triangle: List[List[int]]) -> int:
#         m = len(triangle)
#         dp = triangle[-1][:]  # start from the last row

#         for i in range(m - 2, -1, -1):   # bottom-up
#             for j in range(len(triangle[i])):
#                 dp[j] = triangle[i][j] + min(dp[j], dp[j + 1])

#         return dp[0]
class Solution:
    def minimumTotal(self, triangle: List[List[int]]) -> int:
        n=len(triangle)
        dp=[[0]*n for _ in range(n)]
        for j in range(n):
            dp[n-1][j]=triangle[n-1][j]
        for i in range(n-2,-1,-1):
            for j in range(i,-1,-1):
                d=triangle[i][j]+dp[i+1][j]
                dg=triangle[i][j]+dp[i+1][j+1]
                dp[i][j]=min(d,dg)
                # return dp[i][j]
        return dp[0][0]