// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         HashMap<Integer,Integer>map=new HashMap<>();
//         for(int num:nums){
//             map.put(num,map.getOrDefault(num,0)+1);
//             if(map.get(num)>n/2){
//                 return num;
//             }
//         }
//         return -1;
//     }
// }
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
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
        for(int num:nums){
            if(num==ele){
                count1++;
            }
        }
        if(count1>n/2){
            return ele;
        }
        return -1;
    }
}
