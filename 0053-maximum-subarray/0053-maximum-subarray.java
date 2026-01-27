// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSub=nums[0];
//         int prevSum=nums[0];
//         for(int i=1;i<nums.length;i++){
//             if(prevSum<0){
//                 prevSum=nums[i];
//             }
//             else{
//                 prevSum+=nums[i];
//                 maxSub=Math.max(prevSum,maxSub);
//             }
//             if(prevSum>maxSub){
//                 maxSub=prevSum;
//             }
//         }
//         return maxSub;
//     }
// }
class Solution {
    public int maxSubArray(int[] nums) {
        int min=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>min){
                min=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return min;
    }
}