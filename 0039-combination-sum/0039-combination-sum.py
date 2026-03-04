# class Solution:
#     def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
#         ans=[]
#         def findCombinationSum(ind,target,ds):
#             if target==0:
#                 ans.append(list(ds))
#                 return
#             if ind==len(candidates):
#                 return
#             if candidates[ind]<=target:
#                 ds.append(candidates[ind])
#                 findCombinationSum(ind,target-candidates[ind],ds)
#                 ds.pop()
#             findCombinationSum(ind+1,target,ds)
#         findCombinationSum(0,target,[])
#         return ans
class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        result=[]
        self.helper(candidates,0,target,[],result)
        return result

    def helper(self,nums,ind,target,temp,result):
        if ind==len(nums):
            if target==0:
                result.append(temp[:])
            return
        if nums[ind]<=target:
            temp.append(nums[ind])
            self.helper(nums,ind,target-nums[ind],temp,result)
            temp.pop()
        self.helper(nums,ind+1,target,temp,result)