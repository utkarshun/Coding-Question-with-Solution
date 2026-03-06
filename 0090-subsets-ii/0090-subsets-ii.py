# class Solution:
#     def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
#         # sort(nums)
#         ans=[]
#         res=set()
#         n=len(nums)
#         def subsetWithDupHelper(ind:int,ds:List[int]):
#             if index==len(nums):
#                 ds.sort()
#                 res.add(tuple(ds))
#                 return
#             ds.append(nums[ind])
#             subsetWithDupHelper(ind+1,ds)
#             ds.pop()
#             subsetWithDupHelper(ind+1,ds)
#         subsetWithDupHelper(0,[])
#         for it in res:
#             ans.append(list(it))
#         return ans
# class Solution:
#     def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
#         nums.sort()
#         result=[]
#         self.helper(nums,0,[],result)
#         return result
#     def helper(self,nums,ind,temp,result):
#         if ind==len(nums):
#             result.append(temp[:])
#             return
#         temp.append(nums[ind])
#         self.helper(nums,ind+1,temp,result)
#         temp.pop()
#         while ind+1<len(nums) and nums[ind]==nums[ind+1]:
#             ind+=1
#         self.helper(nums,ind+1,temp,result)
class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res=[]
        self.helper(0,nums,[],res)
        return res
    def helper(self,ind,nums,temp,res):
        res.append(temp[:])
        for i in range(ind,len(nums)):
            if (i>ind and nums[i]==nums[i-1]):
                continue
            temp.append(nums[i])
            self.helper(i+1,nums,temp,res)
            temp.pop()