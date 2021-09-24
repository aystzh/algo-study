package aystzh.github.com.algo.array;

/**
 * 买卖股票的最佳时机
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2zsx1/
 * Created by zhanghuan on 2021/9/24.
 */
public class MaxProfit {

    public static void main(String[] args) {
        int[] array = {5, 3, 2, 8, 1};
        int solution = solution(array);
        System.out.println(solution);
    }


    /**
     * 求买入股票的最佳时机
     *
     * @param prices 股票价格数组
     */
    public static int solution(int[] prices) {

        if (prices.length == 0 || prices == null) {
            return 0;
        }
        int tmp = 0;
        int totalPrice = 0;
        for (int i = 1; i < prices.length; i++) {
            int price = prices[i] - prices[tmp];
            if (price > 0) {
                totalPrice = price + totalPrice;
            }
            tmp = tmp + 1;
        }
        return totalPrice;
    }
}
