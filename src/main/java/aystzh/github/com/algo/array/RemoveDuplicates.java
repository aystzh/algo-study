package aystzh.github.com.algo.array;

/**
 * 删除排序数组中的重复项 返回数组长度
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/
 * Created by zhanghuan on 2021/9/24.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 4, 5, 5, 5, 9, 10};
        int length = solution(array);
        System.out.println(length);
    }

    /**
     * 使用双指针
     * <p>
     * 1  2 3 4 4 5
     *
     * @param array 待去重数组
     */
    public static int solution(int[] array) {
        if (array.length == 0 || array == null) {
            return 0;
        }
        //定义慢指针 从0开始
        int i = 0;
        for (int j = 1; j < array.length; j++) {
            //如果快指针和慢指针所在的元素值不相等
            if (array[i] != array[j]) {
                //先将慢指针向右移动一位
                i = i + 1;
                //再将右指针的值赋值给左指针
                array[i] = array[j];
            }
        }
        return i + 1;
    }
}
