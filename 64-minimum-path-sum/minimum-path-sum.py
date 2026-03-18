# class Solution:
#     def minPathSum(self, grid: List[List[int]]) -> int:
#         m=len(grid)
#         n=len(grid[0])
#         dp=[[-1]*n for _ in range(m)]
#         def sum(i,j):
#             if (i==0 and j==0):
#                 return grid[0][0]
#             if (i<0 or j<0):
#                 return float('inf')
#             if dp[i][j]!=-1:
#                 return dp[i][j]
#             up=grid[i][j]+sum(i-1,j)
#             down=grid[i][j]+sum(i,j-1)
#             dp[i][j]=min(up,down)
#             return dp[i][j]
#         return sum(m-1,n-1)
class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        m,n=len(grid),len(grid[0])
        for i in range(m):
            for j in range(n):
                if i==0 and j==0:
                    continue
                up=grid[i-1][j] if i>0 else float('inf')
                left=grid[i][j-1] if j>0 else float('inf')
                grid[i][j]+=min(up,left)
        return grid[m-1][n-1]


        