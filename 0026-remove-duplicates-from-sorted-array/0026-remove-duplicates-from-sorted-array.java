// class Solution {
//     public int removeDuplicates(int[] nums) {
//         Set<Integer>st=new LinkedHashSet<>();
//         for(int n:nums){
//             st.add(n);
//         }
//         int i=0;
//         for(int val:st){
//             nums[i]=val;
//             i++;
//         }
//         return st.size();
//     }
// }
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j];
            }
        }
        return i+1;
    }
}