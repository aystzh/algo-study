package aystzh.github.com.algo.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2jrse/
 * 两数之和
 * Created by zhanghuan on 2021/10/1.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] array = {2, 7, 12, 13, 8};
        int[] array2 = {2, 5, 1, 4};
        System.out.println(Arrays.toString(towSum(array, 9)));
        System.out.println(Arrays.toString(towSum(array2, 3)));

        //方法二
        System.out.println(Arrays.toString(towSum2(array, 9)));
        System.out.println(Arrays.toString(towSum2(array2, 3)));
    }

    public static int[] towSum(int[] array, int target) {
        /**
         * key存放数组值
         * value存放数组角标
         */
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (hashMap.get(target - array[i]) != null) {
                return new int[]{hashMap.get(target - array[i]), i};
            }
            hashMap.put(array[i], i);
        }
        return new int[]{0, 0};
    }

    /**
     * 暴力求解
     * @param array 原始数组
     * @param target 目标值
     * @return 数组下标
     */
    public static int[] towSum2(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                //逐个比较
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}
