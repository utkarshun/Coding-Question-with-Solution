class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        prefix=[]
        prefix.append(nums[0])
        n=len(nums)
        for i in range(1,n):
            prefix.append(prefix[i-1]+nums[i])
        return prefix