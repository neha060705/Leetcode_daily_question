class Solution {
    public int maxProfit(int[] p) {
        int mini=p[0];
        int profit =0;
        for(int i=1;i<p.length;i++){
            int cost = p[i]-mini;
            profit= Math.max(profit,cost);
            mini= Math.min(mini, p[i]);
           
         }
         return profit;
    }
}