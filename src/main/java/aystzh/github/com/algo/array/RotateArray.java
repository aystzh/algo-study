package aystzh.github.com.algo.array;

/**
 * Created by zhanghuan on 2021/9/24.
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        rotate(array, 2);
    }

    /**
     * 数组旋转
     *
     * @param nums 数组元素
     * @param k    移动位置数量
     */
    public static void rotate(int[] nums, int k) {
        int[] tmp = new int[nums.length];
        //把数组元素先放在临时数组里面
        for (int i = 0; i < nums.length; i++) {
            tmp[i] = nums[i];
        }
        //旋转数组
        for (int j = 0; j < nums.length; j++) {
            int index = (j + k) % nums.length;
            nums[index] = tmp[j];
        }
    }
}
