class Solution {
    public boolean canJump(int[] nums) {
        int finalposition=nums.length-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(i+nums[i]>=finalposition){
                finalposition=i;
            }
        }
        return finalposition==0;
    }
}