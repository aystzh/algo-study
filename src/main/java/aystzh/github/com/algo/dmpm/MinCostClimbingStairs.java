package aystzh.github.com.algo.dmpm;

/**
 * 最小花费爬楼梯
 * https://leetcode-cn.com/problems/min-cost-climbing-stairs/
 * Created by zhanghuan on 2022/3/8.
 */
public class MinCostClimbingStairs {


    public static void main(String[] args) {
        //int[] costs = {10, 15, 20};
        int[] costs = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(miniCostClimbingStairs(costs));
    }


    public static int miniCostClimbingStairs(int[] costs) {
        int[] dp = new int[costs.length];

        dp[0] = costs[0];
        dp[1] = costs[1];
        for (int i = 2; i < costs.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + costs[i];
        }
        return Math.min(dp[costs.length - 1], dp[costs.length - 2]);
    }

}
