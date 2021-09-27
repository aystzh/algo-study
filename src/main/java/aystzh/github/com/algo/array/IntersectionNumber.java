package aystzh.github.com.algo.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 两数组交集
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2y0c2/
 * Created by zhanghuan on 2021/9/27.
 */
public class IntersectionNumber {


    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4};
        int[] numbers2 = {2, 3, 4};
        int[] intersect = intersect(numbers1, numbers2);
        for (int i = 0; i < intersect.length; i++) {
            System.out.println(intersect[i]);
        }
    }


    /**
     * 1、先排序 2、双指针解法
     *
     * @param numbers1 数组1 numbers2 数组2
     * @return 交集数组
     */
    public static int[] intersect(int[] numbers1, int[] numbers2) {
        Arrays.sort(numbers1);
        Arrays.sort(numbers2);

        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();

        //1 2 3 4
        //2 3 4 5
        while (i < numbers1.length && j < numbers2.length) {
            if (numbers1[i] < numbers2[j]) {
                i++;
            } else if (numbers1[i] > numbers2[j]) {
                j++;
            } else {
                list.add(numbers1[i]);
                i++;
                j++;
            }
        }

        //list to array
        int index = 0;

        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[index++] = list.get(k);
        }

        return res;
    }
}
