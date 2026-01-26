class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int moreneeded=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            moreneeded=target-num;
            if(map.containsKey(moreneeded)){
                return new int[]{map.get(moreneeded),i};
            }
            else{
                map.put(num,i);
            }
        }
        return new int[]{-1,-1};
    }
}
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//             int n=nums.length;
//             int [][]arr=new int[n][2];
//             for(int i=0;i<nums.length;i++){
//                 arr[i][0]=nums[i];
//                 arr[i][1]=i;
//             }
//             Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
//             int left=0,right=nums.length-1;
//             while(left<right){
//                 int sum=arr[left][0]+arr[right][0];
//                 if(sum==target){
//                     return new int[]{arr[left][1],arr[right][1]};
//                 }
//                 else if(sum<target){
//                     left++;
//                 }
//                 else{
//                     right--;
//                 }
//             }
//             return new int[]{-1,-1};
//         }
// }