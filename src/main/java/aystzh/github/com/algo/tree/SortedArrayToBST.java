package aystzh.github.com.algo.tree;

/**
 * 有序数组转化为一颗二叉树
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xninbt/
 * Created by zhanghuan on 2022/2/23.
 */
public class SortedArrayToBST {


    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }


    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        //中间节点即为树🌲的根节点
        int middle = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = sortedArrayToBST(nums, start, middle - 1);
        root.right = sortedArrayToBST(nums, middle + 1, end);
        return root;
    }
}
