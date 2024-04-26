import java.util.Scanner;
import java.lang.Math;

public class BestTimeBuySellStock2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        for (int sell : prices) {
            profit = Math.max(profit, sell - buy);
            buy = Math.min(buy, sell);
        }

        return profit;
    }

    public static void main(String[] args) {
        // declaration
        BestTimeBuySellStock2 solution = new BestTimeBuySellStock2();
        Scanner in = new Scanner(System.in);
        int size, res;
        int[] prices;

        // input
        System.out.print("Enter the size of the prices: ");
        size = in.nextInt();

        prices = new int[size];
        System.out.println("Enter the prices: ");
        for (int i = 0; i < size; i++) {
            System.out.print("> ");
            prices[i] = in.nextInt();
        }

        // processing
        res = solution.maxProfit(prices);

        // output
        System.out.println("\nResult: ");
        System.out.printf("The maximum profit is: %d\n", res);
    }
}
