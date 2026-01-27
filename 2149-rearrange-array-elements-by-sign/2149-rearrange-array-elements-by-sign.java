// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         List<Integer>temp1=new ArrayList<>();
//         List<Integer>temp2=new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>0){
//                 temp1.add(nums[i]);
//             }
//             else if(nums[i]<0){
//                 temp2.add(nums[i]);
//             }
//         }
//         List<Integer>res=new ArrayList<>();
//         for(int i=0;i<temp1.size();i++){
//             res.add(temp1.get(i));
//             res.add(temp2.get(i));
//         }
//         int []result=new int[res.size()];
//         for(int i=0;i<res.size();i++){
//             result[i]=res.get(i);
//         }
//         return result;
//     }
// }
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] res=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[pos]=nums[i];
                pos+=2;
            }
            else{
                res[neg]=nums[i];
                neg+=2;
            }
        }
        return res;
    }
}