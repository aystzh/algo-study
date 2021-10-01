package aystzh.github.com.algo.array;

import java.util.Arrays;

/**
 * Created by zhanghuan on 2021/9/29.
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] array = {3, 4, 3, 0, 0, 4, 2};
       // System.out.println(Arrays.toString(moveZeroes(array)));
        System.out.println(Arrays.toString(moveZero2(array)));
    }


    /**
     * 把非0的全部往前移
     * 异动前：3, 4, 3, 0, 0, 4, 2
     * 移动后：3, 4, 3, 4, 2, 0, 0
     *
     * @param array 数组
     */
    public static int[] moveZeroes(int[] array) {

        if (array == null || array.length == 0) {
            return null;
        }

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index++] = array[i];
            }
        }

        while (index < array.length) {
            array[index++] = 0;
        }
        return array;
    }

    /**
     * 把非0的全部往前移
     * 异动前：3, 4, 3, 0, 0, 4, 2
     * 移动后：3, 4, 3, 4, 2, 0, 0
     *
     * @param array 数组
     */
    //双指针解法
    public static int[] moveZero2(int[] array) {
        if (array.length == 0 || array == null) {
            return null;
        }

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                //不为0就往前移动
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                j++;
            }
        }
        return array;
    }
}
