package aystzh.github.com.algo.str;

import org.junit.Test;

/**
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnx13t/
 * Created by zhanghuan on 2021/10/11.
 */
public class ReverseNumber {

    @Test
    public void test() {
        System.out.println(reverse(-1234560));
    }

    public int reverse(int x) {
        int res = 0;

        while (x != 0) {
            int t = x % 10;
            int newRes = res * 10 + t;
            //如果数字溢出 则直接返回0

            if ((newRes - t) / 10 != res) {
                return 0;
            }

            res = newRes;
            x = x / 10;
        }
        return res;
    }
}
