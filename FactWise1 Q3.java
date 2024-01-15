Maximixe Your Profit

class Solution {
    public int maxprofit(int[] prices) {
        int isf = integer.MAX_VALUE;
        int op = 0;
        int Pist = 0;

        for(int i = 0; i, i < prices.length; i++){
            if(prices[i] < isf){
                isf = prices[i];            
            }
            pist = prices[i] - isf;
            if(op < Pist){
                op = Pist;
            }
        }
        return op;
    }
}