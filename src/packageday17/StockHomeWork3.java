package packageday17;

public class StockHomeWork3 {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int min = Integer.MIN_VALUE;
        int maxProfit = 0;
        for (int p : prices) {
            min = Math.min(min, p);
            int profit = p - min;
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.println(maxProfit);

     //   Input: [7,6,4,3,1]

//    Output: 0

//    Explanation: In this case, no transaction is done, i.e. max profit = 0.





    }
}
