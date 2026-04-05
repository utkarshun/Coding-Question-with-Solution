class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int n=nums.length;
        int ele=0;
        for(int num:nums){
            if(count==0){
                count=1;
                ele=num;
            }
            else if(num==ele){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele){
                count1++;
            }
        }
        if(count1>n/2){
            return ele;
        }
        return -1;
    }
}