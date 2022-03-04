package aystzh.github.com.algo.dmpm;

/**
 * 斐波那契数列
 * Created by zhanghuan on 2022/3/4.
 */
public class FIB {


    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    /**
     * 0 1 1 2 3 5
     *
     * @param n
     * @return
     */
    public static int solution(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            System.out.println(dp[i]);
        }
        return dp[n];
    }

    /**
     * 优化  时间 O(N) 空间(O1)
     * 0 1 1 2 3 5
     * @return
     */
    public static int solution2(int n) {
        if (n < 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int sum = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = sum;
        }
        return dp[1];
    }

}
