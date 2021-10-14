package aystzh.github.com.algo.str;

import org.junit.Test;

/**
 * 字符串最长公共前缀
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnmav1/
 * Created by zhanghuan on 2021/10/14.
 */
public class LongestCommonPrefix {


    @Test
    public void test() {
        String[] trs = new String[]{"flower", "flow", "flight"};
        String s = longestCommonPrefix(trs);
        System.out.println(s);
    }

    private String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        String pre = strs[0];
        int i = 1;

        while (i < strs.length) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
            i++;
        }
        return pre;
    }
}
