class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer>temp=new HashSet<>();
        for(int num:nums){
            if(num!=0){
                temp.add(num);
            }
        }
        return temp.size();
    }
}