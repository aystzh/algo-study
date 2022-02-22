package aystzh.github.com.algo.tree;

/**
 * 验证二叉搜索树
 * https://leetcode-cn.com/problems/validate-binary-search-tree/solution/zhong-xu-bian-li-qing-song-na-xia-bi-xu-miao-dong-/
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn08xg/
 * Created by zhanghuan on 2022/2/22.
 */
public class IsValidBST {
    /**
     * 递归解决 中序遍历  其实就是升序遍历  左-->根-->右
     *
     * @param root
     * @return
     */
    long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        return isValidBST(root.right);
    }
}
