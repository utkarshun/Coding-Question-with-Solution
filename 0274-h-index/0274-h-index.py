# class Solution:
#     def hIndex(self, citations: List[int]) -> int:
#         citations.sort()
#         n=len(citations)
#         h=0
#         for i in range(n):
#             if citations[i]>=n-i:
#                 h=max(h,n-i)
#         return h
# class Solution:
#     def hIndex(self, citations: List[int]) -> int:
#         n=len(citations)
#         count=[0]*(n+1)
#         for c in citations:
#             if c>=n:
#                 count[n]+=1
#             else:
#                 count[c]+=1
#         h=n
#         papers=count[n]
#         while papers<h:
#             h-=1
#             papers+=count[h]
#         return h
# class Solution:
#     def hIndex(self, citations: List[int]) -> int:
#         citations.sort()
#         n=len(citations)
#         h=0
#         for i in range(n):
#             h=max(h,min(citations[i],n-i))
#         return h
class Solution:
    def hIndex(self, citations: List[int]) -> int:
        n=len(citations)
        paper_counts=[0] * (n+1)
        for c in citations:
            paper_counts[min(n,c)]+=1

        h=n
        papers=paper_counts[n]
        while papers<h:
            h-=1
            papers+=paper_counts[h]
        return h