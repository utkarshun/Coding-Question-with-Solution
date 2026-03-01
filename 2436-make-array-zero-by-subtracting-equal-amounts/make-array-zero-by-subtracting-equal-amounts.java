// class Solution {
//     public int minimumOperations(int[] nums) {
//         HashSet<Integer>temp=new HashSet<>();
//         for(int num:nums){
//             if(num!=0){
//                 temp.add(num);
//             }
//         }
//         return temp.size();
//     }
// }
class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int n:nums){
            if(n>0){
                pq.add(n);
            }
        }
        int operation=0;
        int prev=0;
        while(!pq.isEmpty()){
            int curr=pq.poll();
            if(curr!=prev){
                operation++;
                prev=curr;
            }
        }
        return operation;
    }
}