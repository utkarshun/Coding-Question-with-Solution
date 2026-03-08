// class Solution {
//     public int maxProfit(int[] prices) {
//         int diff=0;
//         int maxi=Integer.MIN_VALUE;
//         int n=prices.length;
//         if(prices.length<2) return 0;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<prices.length;j++){
//                 diff=prices[j]-prices[i];
//                 if(diff<0) diff=0;
//                 maxi=Math.max(maxi,diff);
//             }
//         }
//         return maxi;
//     }
// }
class Solution {
    public int maxProfit(int[] prices) {
        int diff=0;
        int maxi=0;
        int i=0;
        for(int j=1;j<prices.length;j++){
            if(prices[j]>prices[i]){
                diff=prices[j]-prices[i];
                maxi=Math.max(maxi,diff);
            }
            else{
                i=j;
            }
        }
        return maxi;
    }
}