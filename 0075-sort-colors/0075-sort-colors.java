// class Solution {
//     public void sortColors(int[] nums) {
//         // Arrays.sort(nums);
//         int cnt0=0;
//         int cnt1=0;
//         int cnt2=0;
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             if(nums[i]==0) cnt0++;
//             else if(nums[i]==1) cnt1++;
//             else cnt2++;
//         }
//         for(int i=0;i<cnt0;i++) nums[i]=0;
//         for(int i=cnt0;i<cnt0+cnt1;i++) nums[i]=1;
//         for(int i=cnt0+cnt1;i<n;i++) nums[i]=2;
//     }
// }
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}