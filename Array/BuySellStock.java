public class BuySellStock {
    public static int maxProfit(int[] price){
        // int profit=0;
        // int maxProfit=0;
        // int cp,sp;
        // for(int i=0;i<price.length;i++){
        //     cp=price[i];
        //     for(int j=i+1;j<price.length;j++){
        //         if(price[i]<price[j]){
        //             sp=price[j];
        //             profit=sp-price[i];
        //         }
        //         if(profit>maxProfit){
        //             maxProfit=profit;
        //         }
        //     }
        // }
        // return maxProfit;

        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
       for(int i=0;i<price.length;i++){
        if(buyPrice<price[i]){
           int profit =price[i]-buyPrice;
           maxProfit=Math.max(maxProfit, profit);
        }else{
            buyPrice=price[i];
        }
       }
       return maxProfit;
    }

    public static void main(String[] args) {
        int[] price={4,3,6,9,12,1};
        System.out.println(maxProfit(price));
    }
}
 