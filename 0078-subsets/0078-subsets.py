class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result=[]
        self.helper(nums,0,[],result)
        return result
    def helper(self,nums:List[int],ind:int,temp:List[int],result:List[List[int]]):
        if ind>=len(nums):
            result.append(temp[:])
            return
        temp.append(nums[ind])
        self.helper(nums,ind+1,temp,result)
        temp.pop()
        self.helper(nums,ind+1,temp,result)
        