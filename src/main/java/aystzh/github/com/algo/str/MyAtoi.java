package aystzh.github.com.algo.str;

import org.junit.Test;

/**
 * 字符串转换整数
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnoilh/
 * Created by zhanghuan on 2021/10/14.
 */
public class MyAtoi {


    @Test
    public void test() {
        String s = "-91283472332";
        System.out.println(myAtoi(s));
    }


    public int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0)
            return 0;

        int index = 0;
        int res = 0;
        int sign = 1;
        int length = str.length();

        if (str.charAt(index) == '-' || str.charAt(index) == '+') {
            sign = str.charAt(index++) == '+' ? 1 : -1;
        }

        for (; index < length; ++index) {
            int digit = str.charAt(index) - '0';

            if (digit < 0 || digit > 9) {
                break;
            }
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else {
                res = res * 10 + digit;
            }
        }
        return sign * res;
    }
}
