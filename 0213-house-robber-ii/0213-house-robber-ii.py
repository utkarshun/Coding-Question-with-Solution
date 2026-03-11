class Solution:
    def rob(self, nums: List[int]) -> int:
        n=len(nums)
        if n==1:
            return nums[0]
        def linearRob(arr):
            m=len(arr)
            dp=[-1]*m
            dp[0]=arr[0]
            for i in range(1,m):
                take=arr[i]
                if i>1:
                    take+=dp[i-2]
                nottake=dp[i-1]
                dp[i]=max(take,nottake)
            return dp[m-1]
        case1=linearRob(nums[:-1])
        case2=linearRob(nums[1:])
        return max(case1,case2)

# class Solution:
#     def rob(self, nums: List[int]) -> int:
#         n=len(nums)
#         if n==1:
#             return nums[0]
#         def house(arr):
#             m=len(arr)
#             dp=[-1]*m
#             def f(ind):
#                 if ind==0:
#                     return arr[ind]
#                 if ind<0:
#                     return 0
#                 if dp[ind]!=-1:
#                     return dp[ind]
#                 left=f(ind-1)
#                 right=f(ind-2)+arr[ind]
#                 dp[ind]=max(left,right)
#                 return dp[ind]
#             return f(m-1)
#         case1=house(nums[:-1])
#         case2=house(nums[1:])
#         return max(case1,case2)

