package aystzh.github.com.algo.str;

import org.junit.Test;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn96us/
 * Created by zhanghuan on 2021/10/11.
 */
public class IsAnagram {

    @Test
    public void test() {
        System.out.println(isAnagram("abcdd","dddabc"));
    }

    public boolean isAnagram(String first,String second) {
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();

        Arrays.sort(firstChars);
        Arrays.sort(secondChars);
        return Arrays.equals(firstChars, secondChars);
    }
}
