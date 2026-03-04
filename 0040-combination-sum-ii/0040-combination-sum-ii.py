# class Solution:
#     def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
#         ans=[]
#         ds=[]
#         candidates.sort()
#         def findCombinationSum2(ind:int,target:int):
#             if target==0:
#                 ans.append(ds[:])
#                 return
#             for i in range(ind,len(candidates)):
#                 if i>ind and candidates[i]==candidates[i-1]:
#                     continue
#                 if candidates[i]>target:
#                     break
#                 ds.append(candidates[i])
#                 findCombinationSum2(i+1,target-candidates[i])
#                 ds.pop()
#         findCombinationSum2(0,target)
#         return ans
class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        candidates.sort()
        result=[]
        self.helper(candidates,0,target,[],result)
        return result

    def helper(self,nums,ind,target,temp,result):
        if target==0:
            result.append(temp[:])
            return
        if ind==len(nums):
            return
        if nums[ind]<=target:
            temp.append(nums[ind])
            self.helper(nums,ind+1,target-nums[ind],temp,result)
            temp.pop()
        while ind+1 <len(nums) and nums[ind]==nums[ind+1]:
            ind+=1
        self.helper(nums,ind+1,target,temp,result)

