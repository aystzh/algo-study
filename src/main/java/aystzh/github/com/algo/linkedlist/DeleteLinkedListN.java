package aystzh.github.com.algo.linkedlist;

/**
 * 删除链表的倒数第N个节点 双指针求解
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn2925/
 * Created by zhanghuan on 2022/2/18.
 */
public class DeleteLinkedListN {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    /**
     * 快慢指针求解删除第N个节点
     * @param head 头节点
     * @param n
     * @return 删除后的链表
     */
    public ListNode deleteNLinkedListNode(ListNode head, int n) {
        //定义快慢节点
        ListNode fast = head;
        ListNode slow = head;
        //先让快节点走n步
        for (int i = 0; i < n; i++) {
            fast = head.next;
        }
        //如果快节点为空，则删除的是头结点
        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
