package aystzh.github.com.algo.array;

import java.util.HashSet;

/**
 * 数组当中是否存在重复元素
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x248f5/
 * Created by zhanghuan on 2021/9/26.
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,5,3};
        boolean b = containsDuplicate(array);
        System.out.println(b);
    }

    /**
     * method1 利用java自带的set功能去重
     * method2 先排序 再挨个比较
     * method3 利用hashmap
     * @param arrays 数组元素
     * @return 是否包含
     */
    public static boolean containsDuplicate(int[] arrays) {
        HashSet<Integer> integers = new HashSet<Integer>();
        for (int i = 0; i < arrays.length; i++) {
            if (!integers.add(arrays[i])) {
                return true;
            }
        }
        return false;
    }
}
