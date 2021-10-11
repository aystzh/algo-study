package aystzh.github.com.algo.str;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhanghuan on 2021/10/11.
 */
public class FirstUniqChar {

    @Test
    public void test() {
        System.out.println(firstUniqChar("loveleetcode"));
    }


    public int firstUniqChar(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

}
