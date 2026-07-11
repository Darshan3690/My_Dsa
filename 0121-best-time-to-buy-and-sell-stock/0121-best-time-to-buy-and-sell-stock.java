class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;

        int max=0;
        int buy=prices[0];

        for(int i=0;i<n;i++)
    {
        int cur=prices[i]-buy;

        if(cur>max){
            max=cur;
        }
        if(buy>prices[i]){
            buy=prices[i];
        }

    }
    return max;
        
    }
}