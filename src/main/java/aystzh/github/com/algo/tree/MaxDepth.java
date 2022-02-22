package aystzh.github.com.algo.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树最大深度
 * https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/solution/mian-shi-ti-55-i-er-cha-shu-de-shen-du-xian-xu-bia/
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnd69e/
 * Created by zhanghuan on 2022/2/22.
 */
public class MaxDepth {


    /**
     * 广度优先遍历方法  核心：利用queue
     *
     * @param root 根节点
     * @return 树的最大深度
     */
    public int maxDepthBFS(TreeNode root) {
        //首先判断特殊情况  root为空 则返回0
        if (root == null) {
            return 0;
        }
        //
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int res = 0;
        //遍历队列
        while (!queue.isEmpty()) {
            res++;
            //
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return res;
    }


    /**
     * 深度优先遍历  核心  利用递归 遍历直到节点为空
     *
     * @param root
     * @return
     */
    public int maxDepthDFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepthDFS(root.left), maxDepthDFS(root.right)) + 1;
    }

}
