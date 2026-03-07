class Solution:
    def check(self,n,board,i,j):
        row,col=i,j
        while row>=0 and col>=0:
            if board[row][col]=='Q':
                return False
            row-=1
            col-=1
        row,col=i,j
        while row>=0 and col<n:
            if board[row][col]=='Q':
                return False
            row-=1
            col+=1
        return True
    def find(self,row,n,ans,board,column):
        if row==n:
            temp=[]
            for r in board:
                temp.append("".join(r))
            ans.append(temp)
            return
        for j in range(n):
            if column[j]==0 and self.check(n,board,row,j):
                column[j]=1
                board[row][j]='Q'
                self.find(row+1,n,ans,board,column)
                column[j]=0
                board[row][j]='.'

    def solveNQueens(self, n: int) -> List[List[str]]:
        ans=[]
        board=[["."] * n for _ in range(n)]
        column=[False]*n
        self.find(0,n,ans,board,column)
        return ans

