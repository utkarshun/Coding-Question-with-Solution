class Solution(object):
    def uniquePaths(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        dp=[[-1 for _ in range(n)] for _ in range(m)]
        def f(i,j):
            if dp[i][j]!=-1:
                return dp[i][j]
            if (i==0 and j==0):
                return 1
            if (i<0 or j<0):
                return 0
            up=f(i-1,j)
            left=f(i,j-1)
            dp[i][j]=up+left
            return dp[i][j]
        return f(m-1,n-1)


        