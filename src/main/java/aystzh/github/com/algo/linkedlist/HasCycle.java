package aystzh.github.com.algo.linkedlist;

/**
 * 环形链表
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnwzei/
 * Created by zhanghuan on 2022/2/21.
 */
public class HasCycle {

    private class ListNode {
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

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != slow) {
            if (fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
