class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        arr=[(num,i) for i,num in enumerate(nums)]
        arr.sort()
        left,right=0,len(nums)-1
        sum=0
        while(left<right):
            sum=arr[left][0]+arr[right][0]
            if(sum==target):
                return [arr[left][1],arr[right][1]]
            elif(sum<target):
                left+=1
            else:
                right-=1


# class Solution:
#     def twoSum(self, nums: List[int], target: int) -> List[int]:
#         mp={}
#         for i,num in enumerate(nums):
#             diff=target-num
#             if diff in mp:
#                 return [mp[diff],i]
#             mp[num]=i