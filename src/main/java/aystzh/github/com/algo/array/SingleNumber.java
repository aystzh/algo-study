package aystzh.github.com.algo.array;

/**
 * 只出现一次的数字
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x21ib6/
 * Created by zhanghuan on 2021/9/27.
 */
public class SingleNumber {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 2,  3,1};
        int i = singleNumber(numbers);
        System.out.println(i);
    }

    /**
     * 位运算异或解法 a^0 = a  a^a=0
     * @param numbers 数组
     * @return 只出现一次的数字  没有返回0
     */
    public static int singleNumber(int numbers[]) {
        int reduce = 0;

        for (int num : numbers) {
            reduce = reduce ^ num;
        }
        return reduce;
    }
}
