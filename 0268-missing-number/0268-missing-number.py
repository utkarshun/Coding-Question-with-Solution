# class Solution:
#     def missingNumber(self, nums: List[int]) -> int:
# #         # HashMap<Integer,Boolean>hs=new HashMap<>()
#         s=set(nums)
#         n=len(nums)
#         for i in range(n+1):
#             if i not in s:
#                 return i

class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        seen=[False]*(n+1)
        for num in nums:
            seen[num]=True
        for i,present in enumerate(seen):
            if not present:
                return i
# class Solution:
#     def missingNumber(self, nums: List[int]) -> int:
#         n=len(nums)
#         sum=(n*(n+1))//2
#         s=0
#         for i in range(n):
#             s+=nums[i]
#         return sum-s
# class Solution:
#     def missingNumber(self, nums: List[int]) -> int:
#         nums.sort()
#         def binarySearch(left,right):
#             if left>=right:
#                 return left
#             mid=(left+right)//2
#             if nums[mid]>mid:
#                 return binarySearch(left,mid)
#             else:
#                 return binarySearch(mid+1,right)
#         return binarySearch(0,len(nums))

