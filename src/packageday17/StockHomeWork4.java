package packageday17;

public class StockHomeWork4 {
    public static void main(String[] args) {

//    Input: [7,1,5,3,6,4]

//    Output: 7

//    Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.

//    Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

//    Example 2:

        int[] prices = new int[]{7,1,5,3,6,4};
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int p : prices) {
           min = Math.min(min, p);
            int profit = p - min;
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.println(maxProfit);



    }
}
