package aystzh.github.com.algo.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树层序遍历
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/solution/bfs-de-shi-yong-chang-jing-zong-jie-ceng-xu-bian-l/
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnldjj/
 * Created by zhanghuan on 2022/2/23.
 */
public class LevelOrder {


    /**
     * 广度优先遍历   核心利用queue
     * @param root
     * @return
     */
    public List<List<Integer>> levelsOrderBFS(TreeNode root) {
        //首先判断树是否为空
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        List<List<Integer>> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                //返回当前队列的元素 并且移除当前元素 Java 的 pop 写作 poll()
                TreeNode node = queue.poll();
                subList.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(subList);
        }
        return res;
    }
}
