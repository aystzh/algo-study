package aystzh.github.com.algo.tree;

/**
 * 对称二叉树
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn7ihv/
 * Created by zhanghuan on 2022/2/22.
 */
public class IsSymetric {

    public boolean isSymetric(TreeNode root){
        if (root == null) {
            return true;
        }
        return isSymmetricHelper(root.left, root.right);
    }


    /**
     * 判断二叉树是否对称  要求 二叉树的左子节点的左子节点和右子节点的右子节点相等   左子节点的右子节点和右子节点的左子节点相等
     * @param left
     * @param right
     * @return
     */
    private boolean isSymmetricHelper(TreeNode left,TreeNode right) {
        //如果左右子节点都为空  则为true
        if (left == null && right == null) {
            return true;
        }
        //如果当前节点只有一个子节点或者两个子节点的值不相等 返回FALSE
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        //判断二叉树的左子节点的左子节点和右子节点的右子节点相等   左子节点的右子节点和右子节点的左子节点相等
        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }
}
