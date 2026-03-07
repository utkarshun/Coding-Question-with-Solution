class Solution:
    def find(self,row,n,ans,board,column,leftDig,rightDig):
        if row==n:
            temp=[]
            for r in board:
                temp.append("".join(r))
            ans.append(temp)
            return
        for j in range(n):
            if column[j]==0 and leftDig[n-1+j-row]==0 and rightDig[row+j]==0:
                column[j]=1
                board[row][j]='Q'
                leftDig[n-1+j-row]=1
                rightDig[row+j]=1
                self.find(row+1,n,ans,board,column,leftDig,rightDig)
                column[j]=0
                board[row][j]='.'
                leftDig[n-1+j-row]=0
                rightDig[row+j]=0

    def solveNQueens(self, n: int) -> List[List[str]]:
        ans=[]
        board=[["."] * n for _ in range(n)]
        column=[0]*n
        leftDig=[0]*(2*n-1)
        rightDig=[0]*(2*n-1)
        self.find(0,n,ans,board,column,leftDig,rightDig)
        return ans

