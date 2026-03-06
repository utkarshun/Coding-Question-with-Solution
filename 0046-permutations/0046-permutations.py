class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        ans=[]
        ds=[]
        freq=[False]*len(nums)
        def helper():
            if len(ds)==len(nums):
                ans.append(ds[:])
                return
            for i in range(len(nums)):
                if not freq[i]:
                    freq[i]=True
                    ds.append(nums[i])
                    helper()
                    ds.pop()
                    freq[i]=False

        helper()
        return ans