class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<=nums.length;i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return -1;
        // int sum=0;
        // int n=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        // }
        // int sum1=n*(n+1)/2;
        // return sum1-sum;
    }
}