public class BuyStocks {
    public static int maxProfit(int[] price){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<price.length;i++){
            if(buyPrice>price[i]){
                buyPrice=price[i];
            }else{
                int profit = price[i]-buyPrice;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }
      public static void main(String[] args) {
        int[] price={5,4,3,2};
        System.out.println(maxProfit(price));
    }
}
