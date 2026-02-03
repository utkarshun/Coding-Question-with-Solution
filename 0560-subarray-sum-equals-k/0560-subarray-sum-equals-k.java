// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         HashMap<Integer,Integer>temp=new HashMap<>();
//         int count=0;
//         int sum=0;
//         temp.put(0,1);
//         for(int num:nums){
//             sum+=num;
//             if(temp.containsKey(sum-k)){
//                 count+=temp.get(sum-k);
//             }
//             temp.put(sum,temp.getOrDefault(sum,0)+1);
//         }
//         return count;
//     }
// }
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int left=0,right=0,sum=0,count=0;
//         int n=nums.length;
//         while(right<n){
//             sum+=nums[right];
//             while(left<right && sum>k){
//                 sum-=nums[left];
//                 left++;
//             }
//             if(sum==k){
//                 count+=1;
//             }
//             right++;
//         }
//         return count;
//     }
// }
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0,count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}