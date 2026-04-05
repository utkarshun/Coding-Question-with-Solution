class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int result=0;
        int n=prices.length;
        int maxi=0;
        for(int j=1;j<n;j++){
            if(prices[j]>=prices[i]){
                result=prices[j]-prices[i];
                maxi=Math.max(maxi,result);
            }
            else{
                i=j;
            }
        }
        return maxi;
    }
}