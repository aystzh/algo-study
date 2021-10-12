package aystzh.github.com.algo.str;

import org.junit.Test;

/**
 * 是否为回文字符串  回文字符串 则是 对称字符串
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xne8id/
 * Created by zhanghuan on 2021/10/11.
 */
public class IsPalindrome {

    @Test
    public void test() {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

        String sql = "truncate table test_ceic_push_data";
        System.out.println("sql: " + (sql.length() > 100 ? sql.substring(0, 100) : sql));
    }

    public boolean isPalindrome(String str) {
        if (str.length() == 0) {
            return true;
        }

        int left = 0;
        int right = str.length() - 1;

        //先过滤非数字 字符的
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
