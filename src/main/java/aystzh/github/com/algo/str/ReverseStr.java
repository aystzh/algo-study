package aystzh.github.com.algo.str;



import org.junit.Test;

import java.util.Arrays;

/**
 * 字符串翻转
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnhbqj/
 *
 * Created by zhanghuan on 2021/10/10.
 */
public class ReverseStr {
    @Test
    public void test() {
        char[] str = new char[]{
                'a', 'b', 'c', 'd', 'e', 'f'
        };
        System.out.println(Arrays.toString(reverseStr(str)));
    }


    /**
     * a b c d e f g
     * g f e d c b a
     * <p>
     * tmp
     *
     * @param str
     */
    private char[] reverseStr(char[] str) {
        int j = str.length - 1;
        if (str == null || str.length == 0) {
            return new char[0];
        }
        int left = 0;
        while (left < j) {
            swap(str, left++, j--);
        }
        return str;
    }

    public void swap(char[] str, int start, int end) {
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
    }
}
