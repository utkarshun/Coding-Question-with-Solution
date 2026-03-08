class Solution {
    public int maxProfit(int[] prices) {
        int diff=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                diff+=prices[i]-prices[i-1];
            }
        }
        return diff;
    }
}
// class Solution {
//     public int maxProfit(int[] prices) {
//         int n = prices.length;
//         int l = 0, r = 1;
//         int profit = 0;

//         while (r < n) {
//             // find a valley
//             while (r < n && prices[r] <= prices[r - 1]) r++;
//             l = r - 1;

//             // find a peak
//             while (r < n && prices[r] >= prices[r - 1]) r++;
//             if (r - 1 > l) profit += prices[r - 1] - prices[l];
//         }

//         return profit;
//     }
// }
