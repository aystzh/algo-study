package aystzh.github.com.algo.array;

import java.util.Arrays;

/**
 * 合并两个有序数组
 * https://leetcode-cn.com/problems/merge-sorted-array/solution/88-by-ikaruga/
 * Created by zhanghuan on 2022/2/24.
 */
public class MergeSortedArray {


    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5, 6};
        int[] num2 = {4, 6};
        System.out.println(Arrays.toString(merge(num1, 5, num2, 1)));
    }
// i 2 3 4 5 0
    //1 2 3 4 5 0
    //1 2 3 4 4 5

    /**
     * m+n = num1.length
     * 定义三个变量
     * @param nums1 数组1
     * @param m 数组1的长度
     * @param nums2 数组2
     * @param n 数组2的长度
     * @return
     */
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        //指向数组1的
        int i = m - 1;
        //指向数组2的末尾
        int j = n - 1;
        //合并后数组的长度
        int end = m + n - 1;
        while (j >= 0) {
            nums1[end--] = (i >= 0 && nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
        return nums1;
    }

}
