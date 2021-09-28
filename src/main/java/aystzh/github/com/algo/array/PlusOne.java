package aystzh.github.com.algo.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2cv1c/
 * 数组＋1
 * Created by zhanghuan on 2021/9/28.
 */
public class PlusOne {

    public static void main(String[] args) {
        //Integer[] ints = plusOne(digits);


        int[] test = {4, 9, 9, 9};
        Integer[] digits = {4, 9, 9, 9};
        Stream.of(digits).forEach(System.out::println);
        Stream.of(test).forEach(System.out::println);
        System.out.println(Arrays.toString(test));
    }


    /**
     * 分三种情况 1  不需要进位  2 数字为9 需要加一  3  都为9的情况
     *
     * @param digits
     * @return
     */
    public static Integer[] plusOne(Integer[] digits) {

        //9 9 9 9 9
        for (int i = digits.length - 1; i >= 0; i--) {
            int endNumber = digits[i];
            endNumber = endNumber + 1;
            if (endNumber == 10) {
                //说明大于9 需要进位
                digits[i] = 0;
            } else {
                //说明不等于9  直接+1 返回
                digits[i]++;
                return digits;
            }
        }

        int l = digits.length + 1;
        Integer[] tmpArray = new Integer[l];
        //处理都为999的情况  把数组的长度＋1 然后首位置成1
        tmpArray[0] = 1;

        return tmpArray;

    }
}
